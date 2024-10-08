package org.designpatterns.behavioral.visitor.example1.shapes;

import lombok.Getter;
import org.designpatterns.behavioral.visitor.example1.visitor.Visitor;

@Getter
public class Dot implements Shape {
    private int id;
    private int x;
    private int y;

    public Dot(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        // move shape
    }

    @Override
    public void draw() {
        // draw shape
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitDot(this);
    }

}
