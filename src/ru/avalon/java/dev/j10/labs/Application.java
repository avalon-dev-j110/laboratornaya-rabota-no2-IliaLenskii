package ru.avalon.java.dev.j10.labs;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;

public class Application {

    public static void main(String[] args) {
        Random r = new Random();
        Shape[] shapes = new Shape[10];

        for(int i = 0; i < shapes.length; ++i) {
            int rnd = r.nextInt(3);
            float v1 = (r.nextFloat() + 0.1F) * 8F;
            float v2 = (r.nextFloat() + 0.1F) * 4F;

            if(rnd == 0)
                shapes[i] = new Circle(v1);
            else if(rnd == 1)
                shapes[i] = new Rectangle(v1, v2);
            else
                shapes[i] = new Triangle(v1, v2);

            //System.out.format("%s: %f%n", shapes[i].getClassName(), shapes[i].getArea());
        }

        Shape maxArea = Application.getMaxShapeArea(shapes);

        System.out.format("The %s is the maxest area %f%n", maxArea.getClassName(), maxArea.getArea());
    }

    public static Shape getMaxShapeArea(Shape[] shapes) {

        if(shapes == null || shapes.length < 1)
            return null;

        if(shapes.length == 1)
            return shapes[0];

        float f = 0F;
        Shape currSh = null;

        for(Shape itm : shapes) {
            float ga = itm.getArea();

            if(ga > f) {
                f = ga;
                currSh = itm;
            }
        }

        return currSh;
    }
}
