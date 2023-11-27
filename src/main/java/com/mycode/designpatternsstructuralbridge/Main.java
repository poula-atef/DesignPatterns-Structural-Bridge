package com.mycode.designpatternsstructuralbridge;

import com.mycode.designpatternsstructuralbridge.entities.painters.Painter;
import com.mycode.designpatternsstructuralbridge.entities.painters.RedPainter;
import com.mycode.designpatternsstructuralbridge.entities.shapes.Circle;
import com.mycode.designpatternsstructuralbridge.entities.shapes.Shape;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Main {

    public static void main(String[] args) {
        Painter redPainter = new RedPainter();
        Shape circle = new Circle(redPainter);
        circle.printShape();
    }

}
