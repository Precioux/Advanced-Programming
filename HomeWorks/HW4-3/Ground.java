package com.company;

/**
 * @author Samin Mahdipour
 * @since 11.6.2021
 * This class defines GROUND
 */
public class Ground extends CargoTransportation{
    private int type;

    /**
     *
     * @param name data
     * @param weight data
     * @param insurance data
     * @param type data
     * @param b data
     * @param d data
     */
    public Ground(  String name,double weight,int b,int d,boolean insurance,int type) {
        super(name,weight,b,d,insurance);
        this.type = type;
    }
    //34000 insured 12 13 Ground Normal

    /**
     *
     * @return string
     */
    public String print()
    {
        if( type==1)
            return super.print()+" Ground Normal\n";
        if(type==2)
            return super.print()+" Ground Fast\n";
        if(type==3)
            return super.print()+" Ground Breakable\n";
        else return  super.print()+" Ground \n";
    }
}
