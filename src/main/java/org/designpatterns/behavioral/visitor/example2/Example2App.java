package org.designpatterns.behavioral.visitor.example2;

import org.designpatterns.behavioral.visitor.example2.shapes.Circle;
import org.designpatterns.behavioral.visitor.example2.shapes.Square;
import org.designpatterns.behavioral.visitor.example2.shapes.Triangle;
import org.designpatterns.behavioral.visitor.example2.visitor.AreaVisitor;

public class Example2App {
    public static void main(String[] args) {
        System.out.println("Area: " + new AreaVisitor().calculateArea(
                new Circle(3),
                new Square(5),
                new Triangle(3, 4, 5)));
    }
}
