package com.devmaster.lesson02.dependency_injection;

// Dependency Injection
interface Shape {
    void draw();
}

class CircleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("CircleShape draw");
    }
}

class RectangleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("RectangleShape draw");
    }
}

public class DrawShape {
    private Shape shape;

    public DrawShape(Shape shape) {
        this.shape = shape;
    }

    public void Draw() {
        shape.draw();
    }

    public static void main(String[] args) {
        DrawShape drawShape = new DrawShape(new CircleShape());
        drawShape.Draw();

        drawShape = new DrawShape(new RectangleShape());
        drawShape.Draw();
    }
}
