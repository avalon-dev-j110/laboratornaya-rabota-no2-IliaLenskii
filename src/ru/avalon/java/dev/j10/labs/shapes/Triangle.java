package ru.avalon.java.dev.j10.labs.shapes;

//import java.awt.Polygon;

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
