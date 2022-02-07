package com.company;
import java.util.ArrayList;
/**
 * @author Samin Mahdipour
 * @since 10.26.2021
 * This class is about Rectangle
 */
public class Rectangle {
    public ArrayList<Integer> sides=new ArrayList<>();

    /**
     *
     * @param a data
     * @param b data
     */
    public Rectangle(int a,int b) {
        sides.add(a);
        sides.add(b);
    }
    /**
     *
     * @return 1 if sides are equal
     */
    public int isSquare(){
        int check=0;
        int test=0;
        for (int t: sides) {
            if(t==test)
                check++;
            else test=t;
        }
        if(check==1)
            return 1;
        else return 0;

    }
    /**
     *
     * @return area
     */
    public double calculateArea(){
        double a=1;
        for (int s:sides) {
            a=a*s;
        }
        return a;
    }

    /**
     *
     * @return perimeter
     */
    public double calcP()
    {
        double p=0;
        for (int s:sides) {
            p+=s;
        }
        return p;
    }

    /**
     *
     * @return Rectangle info
     */
    public String toString()
    {
        return "Rectangle   Area: "+calculateArea()+"  Parimeter: "+calcP();
    }

    /**
     * Draw
     */
    public void draw()
    {
        System.out.println(toString());
    }

    /**
     *
     * @param r given rectangle
     * @return Equality check
     */
    public boolean equals(Rectangle r)
    {
        int check=0;
        for(int i=0;i<4;i++)
        {
            if(r.sides.get(i).equals(sides.get(i)))
               check++;
        }
        if(check==4)
            return true;
        else return false;
    }
}
