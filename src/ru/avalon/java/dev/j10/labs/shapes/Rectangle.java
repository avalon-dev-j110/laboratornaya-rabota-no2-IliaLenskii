package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */

public class Rectangle implements Polygon {
    private float side = 0F;
    private float side2 = 0F;

    public Rectangle(float Side, float Side2) {
        this.side = Side;
        this.side2 = Side2;
    }

    public float getArea(){

        if(this.side == 0F || this.side2 == 0F)
            return 0F;

        return this.side * this.side2;
    }

    public float getPerimeter() {

        if(this.side == 0F || this.side2 == 0F)
            return 0F;

        return (this.side + this.side2) * 2;
    }
}
