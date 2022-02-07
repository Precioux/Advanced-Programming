package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
/**
 * @author Samin Mahdipour
 * @since 10.26.2021
 * This class is about Rectangle
 */
public class Rectangle extends Polygon{
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
     * @return true if sides are equal
     */
    public boolean EQ(){

        int check=0;
        int test=0;
        for (int t: sides) {
            if(t==test)
                check++;
            else test=t;
        }
        if(check==1)
            return true;
        else return false;

    }
    /**
     *
     * @return area
     */
    public String calculateArea(){
        double a=1;
        for (int s:sides) {
            a=a*s;
        }
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
        double p=0;
        for (int s:sides) {
            p+=s;
        }
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        return df.format(p);
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

    public void draw()
    {
        System.out.println(toString());
    }
*/
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

    /**
     *
     * @return type
     */
    public int Type(){ return 3;}
    /**
     * print String
     */
    public String toPrint()
    {
        return "Rectangle    Sides : "+ sides;
    }
}
