package com.company;
/**
 * @author Samin Mahdipour
 * @since 11.6.2021
 * This class defines CargoTransportation
 */
//Narges Salehi 12 13 30 Yes Ground Fast
public class CargoTransportation {

      private int b;
      private int d;
      private Client client=new Client();
      private String name;
      private double weight;
      private boolean insurance;
      protected int cost;

    /**
     *
     * @param name data
     * @param weight data
     * @param insurance data
      * @param b data
      * @param d data
     */
    public CargoTransportation(String name, double weight, int b,int d,boolean insurance) {
        this.b=b;
        this.d=d;
        this.name = name;
        this.weight = weight;
        this.insurance = insurance;
        client.addName(name);
    }
   public String print()
   { //34000 insured 12 13 Ground Normal
       if(insurance) {
          return cost + " " + "Insured " + b + " " + d;
       }
       else return cost + " " + "notInsured " + b + " " + d;
   }
}
