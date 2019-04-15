package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> collection = new ArrayList<>();

    public void addFigure(Shape shape){
        collection.add(shape);
        System.out.println(shape.getShapeName());
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (collection.contains(shape)) {
            collection.remove(shape);
            result = true;
        } else {
            System.out.println("Collection doesn't contain that shape!");
        }
        System.out.println(collection.size());
        return result;
    }
    public Shape getFigure(int n){
        Shape shape = null;
        if (n >= 0 && n < collection.size()) {
             shape = collection.get(n);
        } else {
            System.out.println("Collection doesn't contain that shape!");
        }
        return shape;
    }
    public ArrayList showFigures(){
        return collection;
    }

    public int figuresCount() {
        return collection.size();
    }
}
