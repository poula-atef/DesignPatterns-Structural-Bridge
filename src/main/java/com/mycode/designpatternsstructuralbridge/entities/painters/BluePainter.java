package com.mycode.designpatternsstructuralbridge.entities.painters;

public class BluePainter implements Painter {
    @Override
    public void print(String shape) {
        System.out.println("Blue Painter Painting " + shape);
    }

}
