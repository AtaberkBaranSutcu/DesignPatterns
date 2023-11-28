package org.designpatterns.behavioral.visitor.example2.visitor;

import org.designpatterns.behavioral.visitor.example2.shapes.Circle;
import org.designpatterns.behavioral.visitor.example2.shapes.Square;
import org.designpatterns.behavioral.visitor.example2.shapes.Triangle;

public interface Visitor {
    double visit(Circle circle);

    double visit(Square square);

    double visit(Triangle triangle);
}
