package org.designpatterns.behavioral.visitor.example2.visitor;

import org.designpatterns.behavioral.visitor.example2.shapes.Circle;
import org.designpatterns.behavioral.visitor.example2.shapes.Shape;
import org.designpatterns.behavioral.visitor.example2.shapes.Square;
import org.designpatterns.behavioral.visitor.example2.shapes.Triangle;

public class AreaVisitor implements Visitor {
    public double calculateArea(Shape... shapes) {
        double area = 0;
        for (var shape : shapes) {
            area += shape.accept(this);
        }
        return area;
    }

    @Override
    public double visit(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public double visit(Square square) {
        return Math.pow(square.getSide(), 2);
    }

    @Override
    public double visit(Triangle triangle) {
        double sideA = triangle.getSideA();
        double sideB = triangle.getSideB();
        double sideC = triangle.getSideC();
        double semiParameter = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(semiParameter * (semiParameter - sideA) * (semiParameter - sideB) * (semiParameter - sideC));
    }
}
