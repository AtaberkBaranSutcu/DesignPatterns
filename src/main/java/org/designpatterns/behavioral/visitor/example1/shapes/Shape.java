package org.designpatterns.behavioral.visitor.example1.shapes;

import org.designpatterns.behavioral.visitor.example1.visitor.Visitor;

public interface Shape {
    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);
}
