package org.designpatterns.behavioral.visitor.example1.shapes;

import lombok.Getter;
import org.designpatterns.behavioral.visitor.example1.visitor.Visitor;

@Getter
public class Circle extends Dot {
    private int radius;

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

}
