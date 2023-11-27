package com.mycode.designpatternsstructuralbridge.entities.shapes;

import com.mycode.designpatternsstructuralbridge.entities.painters.Painter;

public abstract class Shape {
    private Painter painter;

    public Shape(Painter painter) {
        this.painter = painter;
    }

    public abstract void printShape();
}
