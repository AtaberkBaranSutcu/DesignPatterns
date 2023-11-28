package org.designpatterns.behavioral.visitor.example2.shapes;

import org.designpatterns.behavioral.visitor.example2.visitor.Visitor;

public interface Shape {
    double accept(Visitor visitor);
}
