package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName;
    private double r;
    private double field;

    public Circle(String shapeName, double field, double r){
        this.shapeName = shapeName;
        this.field = field;
        this.r = r;
    }
    public String getShapeName(){
        return shapeName;
    }
    public double getField(){
        field = 3.14 * r * r;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.r, r) != 0) return false;
        if (Double.compare(circle.getField(), getField()) != 0) return false;
        return getShapeName().equals(circle.getShapeName());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getShapeName().hashCode();
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getField());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
