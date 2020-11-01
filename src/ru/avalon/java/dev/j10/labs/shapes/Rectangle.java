package ru.avalon.java.dev.j10.labs.shapes;

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
