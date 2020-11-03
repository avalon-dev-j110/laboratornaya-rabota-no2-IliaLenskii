package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */

public class Triangle implements Polygon {

    private float base = 0F;
    private float side = 0F;
    private float side2 = 0F;

    private float height = 0F;


    public Triangle(float Base, float Height) {

        this.base = Base;
        this.height = Height;
    }

    public Triangle(float Base, float Side, float Side2) {

        this.base = Base;
        this.side = Side;
        this.side2 = Side2;
    }

    public float getArea() {

        if(this.base == 0F || this.height == 0F)
            return 0F;

        return (this.base * this.height) / 2;
    }

    public float getPerimeter() {

        if(this.base == 0F || this.side == 0F || this.side2 == 0F)
            return 0F;

        return this.base + this.side + this.side2;
    }
}
