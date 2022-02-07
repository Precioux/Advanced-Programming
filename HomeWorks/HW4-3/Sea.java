package com.company;

/**
 * @author Samin Mahdipour
 * @since 11.6.2021
 * This class defines SEA
 */
public class Sea extends CargoTransportation{
    /**
     *
     * @param name data
     * @param weight data
     * @param insurance data
     * @param b data
     * @param d data
     *
     */
    public Sea(  String name,double weight,int b,int d,boolean insurance) {
        super(name,weight,b,d,insurance);
    }//34000 insured 12 13 Ground Normal

    /**
     *
     * @return string
     */
    public String print()
    {
        return super.print()+" Sea\n";
    }
}
