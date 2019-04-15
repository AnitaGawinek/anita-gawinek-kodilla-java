package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shapeName;
    private double a;
    private double field;


    public Square(String shapeName, double field, double a){
        this.shapeName = shapeName;
        this.field = field;
        this.a = a;
    }
    public String getShapeName(){
        return shapeName;
    }
    public double getField(){
        field = a * a;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        if (Double.compare(square.a, a) != 0) return false;
        if (Double.compare(square.getField(), getField()) != 0) return false;
        return getShapeName().equals(square.getShapeName());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getShapeName().hashCode();
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getField());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
