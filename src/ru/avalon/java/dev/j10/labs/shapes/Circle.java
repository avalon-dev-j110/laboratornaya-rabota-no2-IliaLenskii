package ru.avalon.java.dev.j10.labs.shapes;

public class Circle implements Point {
    private float radius = 0F;

    public Circle(float Radius) {

        this.radius = Radius;
    }

    public float getArea() {

        if (this.radius < 1)
            return 0F;

        return (float) Math.PI * (this.radius * this.radius);
    }

    public float getPerimeter() {

        if (this.radius < 1)
            return 0F;

        return (float) Math.PI * 2 * this.radius;
    }

    public float getY() {

        return 0F;
    }

    public float getX() {
        return 0F;
    }
}
