package com.mycode.designpatternsstructuralbridge.entities.shapes;

import com.mycode.designpatternsstructuralbridge.entities.painters.Painter;

public class Circle extends Shape {
    private Painter painter;

    public Circle(Painter painter) {
        super(painter);
        this.painter = painter;
    }

    @Override
    public void printShape() {
        painter.print("Circle");
    }
}
