package com.company;

public class Main {

    public static void main(String[] args) {
       Shape circle1 = new Circle(19);
       Shape circle2 = new Circle(3);
       Triangle tri1 = new Triangle(3,4,5);
       Polygon rect2 = new Rectangle(8,5);
       Rectangle rect3 = new Rectangle(6,6);
       Polygon tri2 = new Triangle(6,8,10);
       Triangle tri3 = new Triangle(4,4,6);
       Shape tri4 = new Triangle(9,12,15);
       // circle1 = circle2;
       // rect2 = rect3;
        //tri1 = tri3;
        //cricle2 = tri3;
        tri3 = (Triangle) tri2;
      // rect3 = new Rectangle(2,3);
       // System.out.println(rect3.toString());
        Paint paint=new Paint();
        paint.addShape(circle1);
        paint.addShape(circle2);
        paint.addShape(tri1);
        paint.addShape(rect2);
        paint.addShape(rect3);
        paint.drawAll();
        paint.printAll();
        paint.describeEqualSides();
    }
}
