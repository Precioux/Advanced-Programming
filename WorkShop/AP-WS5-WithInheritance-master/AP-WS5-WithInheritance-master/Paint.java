package com.company;
import java.util.ArrayList;
/**
 * @author Samin Mahdipour
 * @since 10.26.2021
 * This class is about paint
 */
public class Paint {
    private ArrayList<Shape> shapes;
    /**
     * Constructor
     */
   public Paint() {
        shapes = new ArrayList<>();
    }

    /**
     *
     * @param s add shape
     */
    public void addShape(Shape s)
    {
        shapes.add(s);
    }
/*
    /**
     *
     * @param triangle adder

    public void addTriangle(Triangle triangle){
        shapes.add(triangle);
    }

    /**
     *
     * @param circle ADDER

    public void addCircle(Circle circle) {
        shapes.add(circle);
    }

    /**
     *
     * @param rectangle adder
     *
    public void addRectangle(Rectangle rectangle){
        shapes.add(rectangle);
    }
   */
    /**
     * Drawer
     */
    public void drawAll(){
        System.out.println("Let's Draw!");
        for (Shape c:shapes) {
            c.draw();
        }
    }

    /**
     * Printer
     */
    public void printAll(){
        System.out.println("Let's Print!");
        for (Shape s:shapes) {
            System.out.println(s.toPrint());
        }
    }

    /**
     * Checks if sides are Equal
     */
    public void describeEqualSides(){
        System.out.println("Let's Check sides are equal or not");
        for (Shape s:shapes) {
            if (s instanceof Triangle) {
                System.out.print("Triangle is Checking  - ");
                if (s.EQ())
                    System.out.println("Yes! Sides are Equal");
                else System.out.println("Nope");
            }

            if (s instanceof Rectangle) {
                System.out.print("Rectangle is Checking  - ");
                if (s.EQ())
                    System.out.println("Yes! Sides are Equal");
                else System.out.println("Nope");
            }

        }
    }
   /* public static void main(String[] args) {
        Paint paint=new Paint();
        Polygon t1=new Triangle(3,4,5);
        Shape circle2 = new Circle(3);
        Polygon rect2 = new Rectangle(8,5);
        paint.addShape(t1);
        paint.addShape(circle2);
        paint.addShape(rect2);
        paint.drawAll();
        paint.printAll();
        paint.describeEqualSides();
    }*/

}
