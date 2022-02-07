package com.company;

import java.util.ArrayList;

/**
 * @author Samin Mahdipour
 * @since 11.6.2021
 * This class defines client
 */
public class Client {
    protected String name;
    protected ArrayList<CargoTransportation> transportations;
    /**
     *
     * @param name data
     */
    public void  addName(String name)
    {
        this.name=name;
        transportations=new ArrayList<>();
    }

    /**
     * Cargo
     */
    public void printCargo(){
        String str="";
        int i=1;
        for (CargoTransportation c:transportations) {
            str+=i+". Cargo"+i+"\n";
            i++;
        }
        System.out.println(str);
    }
    /**
     * @param i data
     */
    public void print(int i)
    {
        int j=i+1;
     System.out.println("Cargo"+j+"\n"+transportations.get(i).print());
    }
}
