package com.company;
import java.util.ArrayList;
/**
 * @author Samin Mahdipour
 * @since 10.26.2021
 * This class is about Polygon
 */
public class Polygon extends Shape {
    public ArrayList<Integer> sides = new ArrayList<>();
    /**
     *
     * @param side data
     */
    public Polygon(int... side) {
        for (int s : side) {
            sides.add(s);
        }

    }

    /*
     *
     * @return String

    public String toString(){
        int i=0;
      int[] l=new int[4];
      for (int d=0;d<4;d++)
          l[d]=-1;
        for (int s:sides) {
            l[i]=s;
            i++;
        }
        if(l[3]==-1)
             return "Triangle    side1: "+l[0]+" Side2: "+l[1]+" Side3: "+l[2];
        else
            return  "Rectangle   side1: "+l[0]+" Side2: "+l[1]+" Side3: "+l[2]+" Side4: "+l[3];
    }*/

    /**
     *
     * @return type
     */
    public int Type(){ return 2;}
    /**
     *
     * @return Equality
     */
    public boolean Equals()
    {
        System.out.println("YES!  ");
        return false;
    }
}
