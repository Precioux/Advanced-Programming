package com.company;
import java.util.ArrayList;
/**
 * @author Samin Mahdipour
 * @since 10.26.2021
 * This class is about paint
 */
public class Paint {
    private ArrayList<Triangle> triangles;
    private ArrayList<Circle> circles;
    private ArrayList<Rectangle> rectangles;
    /**
     * Constructor
     */
    public Paint() {
        triangles = new ArrayList<>();
        rectangles = new ArrayList<>();
        circles = new ArrayList<>();
    }

    /**
     *
     * @param triangle adder
     */
    public void addTriangle(Triangle triangle){
     triangles.add(triangle);
    }

    /**
     *
     * @param circle ADDER
     */
    public void addCircle(Circle circle) {
        circles.add(circle);
    }

    /**
     *
     * @param rectangle adder
     */
    public void addRectangle(Rectangle rectangle){
       rectangles.add(rectangle);
    }

    /**
     * Drawer
     */
    public void drawAll(){
        System.out.println("Let's Draw!");
        for (Circle c:circles) {
            c.draw();
        }
        for (Triangle t:triangles) {
            t.draw();
        }
        for (Rectangle r:rectangles) {
            r.draw();
        }
    }

    /**
     * Printer
     */
    public void printAll(){
        System.out.println("Let's Print!");
        for (Circle c:circles) {
            System.out.println("Circle     Radius: "+c.getRadius());
        }
        for (Triangle t:triangles) {
            System.out.println("Triangle   Sides:"+t.sides);
        }
        for (Rectangle r:rectangles) {
            System.out.println("Rectangle  Sides:"+r.sides);
        }
    }
}
