package com.company;
import java.util.ArrayList;
/**
 * @author Samin Mahdipour
 * @since 10.26.2021
 * This class is about Shape
 */
public class Shape {

    /**
     * Draw
     */
    public void draw()
    {
        System.out.println(toString());
    }
    /**
     *
     * @return false
     */
    public boolean Equals(){
        return false;
    }
    /**
     *
     * @return perimeter
     */
    public String calculatePerimeter(){
        return "This Method Suppose to calculate perimeter";
    }
    /**
     *
     * @return area
     */
    public String calculateArea(){
        return "This Method Suppose to Calculate area";
    }
    /**
     *
     * @return !
     */
    public String toString(){
        return "This Method Suppose to make data String";
    }
    /**
     * @return type
     */
    public int Type() {
        return 22;
    }

    /**
     *
     * @return printer
     */
    public String toPrint(){
        return "What?";
    }

    /**
     *
     * @return true if sides are EQ
     */
    public boolean EQ(){
        return false;
    };
}
