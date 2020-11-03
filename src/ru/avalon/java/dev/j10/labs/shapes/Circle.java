package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */

public class Circle implements Shape {
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
