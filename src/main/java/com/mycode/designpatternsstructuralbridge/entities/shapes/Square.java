package com.mycode.designpatternsstructuralbridge.entities.shapes;

import com.mycode.designpatternsstructuralbridge.entities.painters.Painter;

public class Square extends Shape {
    private Painter painter;

    public Square(Painter painter) {
        super(painter);
        this.painter = painter;
    }

    @Override
    public void printShape() {
        painter.print("Square");
    }
}
