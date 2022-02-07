package com.company;
import java.text.DecimalFormat;
/**
 * @author Samin Mahdipour
 * @since 10.26.2021
 * This class is about Circle
 */
public class Circle extends Shape {
    private int radius;

    /**
     *
     * @param radius data
     */
    public Circle(int radius) {

        this.radius = radius;
    }
    /**
     *
     * @return Radius
     */
    public int getRadius() {
        return radius;
    }
    /**
     *
     * @param radius setter
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
    /**
     *
     * @return area
     */
    public String calculateArea(){
        double a= (double) radius*(3.14)*radius;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        return df.format(a);

    }
    /**
     *
     * @return perimeter
     */
    public String calcP()
    {
        double p= (double) radius*2*(3.14);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        return df.format(p);
    }
    /**
     *
     * @return Circle info
     */
    public String toString()
    {
        return "Circle      Area: "+calculateArea()+"  Parimeter: "+calcP();
    }
    /**
     *
     * @param c given circle
     * @return Equality check
     */
    public boolean equals(Circle c)
    {
        if(c.radius==radius)
            return true;
        else return false;
    }
    /**
     * type
     */
    public int Type(){ return 1;}
    /**
     * print String
     */
    public String toPrint()
    {
        return "Circle    Radius : "+radius;
    }
}
