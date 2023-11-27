package com.mycode.designpatternsstructuralbridge.entities.painters;

public class RedPainter implements Painter {
    @Override
    public void print(String shape) {
        System.out.println("Red Painter Painting " + shape);
    }
}
