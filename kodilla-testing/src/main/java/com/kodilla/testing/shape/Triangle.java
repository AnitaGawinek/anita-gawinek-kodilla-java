package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName;
    private double field;
    double a;
    double h;

    public Triangle(String shapeName, double field, double a, double h){
        this.shapeName = shapeName;
        this.field = field;
        this.a = a;
        this.h = h;
    }
    public String getShapeName(){
        return shapeName;
    }
    public double getField(){
        field = (a *h)/2;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.getField(), getField()) != 0) return false;
        if (Double.compare(triangle.a, a) != 0) return false;
        if (Double.compare(triangle.h, h) != 0) return false;
        return getShapeName().equals(triangle.getShapeName());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getShapeName().hashCode();
        temp = Double.doubleToLongBits(getField());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(h);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
