package org.designpatterns.behavioral.visitor.example2.shapes;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.designpatterns.behavioral.visitor.example2.visitor.Visitor;

@Data
@AllArgsConstructor
public class Square implements Shape {
    private double side;

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
