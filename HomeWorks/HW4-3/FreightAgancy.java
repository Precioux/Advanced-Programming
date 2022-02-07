package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.*;

/**
 * @author Samin Mahdipour
 * @since 11.6.2021
 * This class defines FreightAgancy
 */

public class FreightAgancy {
    protected ArrayList<CargoTransportation> transportations=new ArrayList<>();
    protected ArrayList<Client> clients=new ArrayList<>();
    private int i=0;

    /**
     *
     * @param beginning data
     * @param destination data
     * @param type data
     * @return if its possible
     */
    public  boolean check(int beginning, int destination, String type)
    {
        boolean checkout=false;
        switch (type)
        {
            case "Ground":
            {

                if(beginning==20 || beginning==21 || destination==20 || destination==21)
                    checkout =false;
                else checkout= true;
                break;
            }
            case "Air":
            {

                if(beginning==17 || beginning==16 || destination==17 || destination==16)
                    checkout =false;
                else checkout= true;
                break;
            }
            case "Sea":
            {

                if(beginning==20 || beginning==21 || destination==20 || destination==21)
                    checkout =true;
                else checkout= false;
                break;
            }
        }
        return checkout;
    }

    /**
     *
     * @return if adding was successful
     */
    public int add() {
        int done;
        Scanner input=new Scanner(System.in);
        String fname=input.next();
        String lname=input.next();
        int beginning=input.nextInt();
        int destination =input.nextInt();
        double weight=input.nextDouble();
        String insurance=input.next();
        boolean ins;
        if(insurance.equals("Yes"))
            ins=true;
        else ins=false;
        String type=input.next();
       // System.out.println(fname+" "+lname+" "+beginning+" "+ destination+" "+weight+" "+type);
        boolean possibility=check(beginning,destination,type);
        if(!possibility)
        {
            System.out.println("Transportation not available");
        }
        else {
            switch (type) {
                case "Ground": {
                    String t = input.next();
                    int n = 0;
                    if (t.equals("Normal"))
                        n = 1;
                    if (t.equals("Fast"))
                        n = 2;
                    if (t.equals("Breakable"))
                        n = 3;
                    Ground ground = new Ground(fname+" "+lname,weight,beginning,destination,ins,n);
                    transportations.add(ground);
                    break;
                }
                case "Air": {
                    Air air = new Air(fname+" "+lname,weight,beginning,destination,ins);
                    transportations.add(air);
                    break;
                }
                case "Sea": {
                    Sea sea = new Sea(fname+" "+lname,weight,beginning,destination,ins);
                    transportations.add(sea);
                    break;
                }
            }
           // System.out.println(fname+lname+i);
            clientAdderA(fname+" "+lname,i);
            costCalculator(beginning,destination,weight,ins,type,i);
            i++;
        }
        Scanner i=new Scanner(System.in);
        done=i.nextInt();
        return done;
    }

    /**
     *
     * @param weight data
     * @return total cost for weight
     */
    public int calculateOverload(double weight)
    {
        int w=(int)weight-20;
        int finalW=w*3000+20*2500;
        return finalW;
    }

    /**
     *
     * @param beginning data
     * @param destination data
     * @param weight data
     * @param ins data
     * @param i data
     * @param type data
     */
    public void costCalculator(int beginning,int destination,double weight, boolean ins,String type,int i)
    {
        int basic=abs(destination-beginning)*5000;
        int wa=(int)Math.ceil(weight);
        int w=0;
        int in=0;
        if(weight<1)
        {
            w=2500;
        }
        else {
            if(weight<=20)
            w=wa*2500;
            else w=calculateOverload(wa);
        }
        if(ins)
        {
            switch (type){
                case "Ground":{
                    in=10000*wa;
                    break;}
                case "Sea":{
                    in=12000*wa;
                    break;}
                case "Air":{
                    in=7000*wa;
                    break;}
            }
        }
        transportations.get(i).cost=basic+w+in;
        System.out.println(basic+w+in);
    }
    /**
     *
     * @param Name data
     * @return index
     */
    public int searchClient(String Name)
    {
        int i=0;
        int index = -1;
        for (Client c:clients) {
            if(c.name.equals(Name))
             index=i;
            i++;
        }
        return index;
    }

    /**
     *
     * @param Name data
     * @param i data
     */
    public void clientAdderA(String Name,int i)
    {
        int index=searchClient(Name);
        if(index==-1){
          Client c=new Client();
            c.addName(Name);
            clients.add(c);
            c.transportations.add(transportations.get(i));
            System.out.println("Client registered");}

            else{
        //  System.out.println(Name+" "+index);
            if(index>=0){
            clients.get(index).transportations.add(transportations.get(i));
            System.out.println("Client has already registered");
            }
            }
        }


    /**
     * @return back
     * adding clients without order
     */
    public int clientAdder()
    {
        Scanner input=new Scanner(System.in);
        String fname=input.next();
        String lname=input.next();
        String Name=fname+" "+lname;
        int index=searchClient(Name);
        if(index==-1)
        {
            Client c=new Client();
            c.addName(Name);
            clients.add(c);
            System.out.println("Client registered");
        }
        else
            System.out.println("Client has already registered");
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        return b;
    }

    /**
     * @return back
     * prints all Transportations
     */
    public int printAll()
    {
        int flag=1;
        int i=1;
        String data="";
        for (CargoTransportation c:transportations) {
            data+= i+". "+c.print();
            i++;
        }
        if(transportations.size()==0 && flag==1)
            System.out.println("No cargo added yet");
        else System.out.println(data);
        Scanner in=new Scanner(System.in);
        int back=in.nextInt();
        return back;
    }
    public int clientsPrint(){
        int i=1;
        int back=1;
        String data="";
        if(clients.size()==0)
            System.out.println("No Client added yet");
        for (Client c: clients) {
            data+=i+". "+c.name+"\n";
            i++;
        }
        System.out.println(data);
        Scanner input = new Scanner(System.in);
        String fn=input.next();
        if(!fn.equals("0")){
             String ln=input.next();
           int index=searchClient(fn+" "+ln);
           clients.get(index).printCargo();
           int a=input.nextInt();
           if(a==0)
               clients.get(index).printCargo();
           else clients.get(index).print(a-1);
        }
        else back=0;
       return back;
    }
  /*  public static void main(String[] args) {
    FreightAgancy f=new FreightAgancy();
    f.add();
    clients.add("SAMIN M")
    f.clientsPrint();
   // f.printAll();
       // boolean o=check(10,11,"Air");
       // System.out.println(o);

    }*/
}
