package ru.avalon.java.dev.j10.labs.shapes;

public interface Shape {

    float getArea();

    default String getClassName() {

        return this.getClass().getSimpleName();
    }
}
