package com.company;
import java.util.ArrayList;
/**
 * @author Samin Mahdipour
 * @since 10.26.2021
 * This class is about Triangle
 */
public class Triangle {
    public ArrayList<Integer> sides=new ArrayList<>();

    /**
     *
     * @param a data
     *  @param b data
     *  @param  c data
     */
    public Triangle(int a,int b,int c) {
       sides.add(a);
       sides.add(b);
       sides.add(c);
    }


    /**
     *
     * @return 1 if sides are equal
     */
    public int isEquilater(){
        int check=0;
        int test=0;
        for (int t: sides) {
            if(t==test)
                check++;
            else test=t;
        }
        if(check==2)
            return 1;
        else return 0;

    }
    /**
     *@return   area
     */
    public double calculateArea()
    {
        int i=0;
        double area=1;
        for (int s:sides) {
            if(i==0)
                area=area*s;
            if(i==1)
                area=area*s;
            if (i==2)
                area=area/2;
        }
        return area;
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
     * @return Triangle info
     */
    public String toString()
    {
        return "Triangle    Area: "+calculateArea()+"  Parimeter: "+calcP();
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
     * @param t given triangle
     * @return Equality Check
     */
    public boolean equals(Triangle t)
    {
        int check=0;
        for(int i=0;i<4;i++)
        {
            if(t.sides.get(i).equals(sides.get(i)))
                check++;
        }
        if(check==3)
            return true;
        else return false;
    }
}
