package org.designpatterns.behavioral.visitor.example1.visitor;

import org.designpatterns.behavioral.visitor.example1.shapes.Circle;
import org.designpatterns.behavioral.visitor.example1.shapes.CompoundShape;
import org.designpatterns.behavioral.visitor.example1.shapes.Dot;
import org.designpatterns.behavioral.visitor.example1.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
