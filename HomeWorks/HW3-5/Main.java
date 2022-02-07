package com.company;
/**
 * @author Samin Mahdipour - 9839039
 * @since 10.31.2021
 * AP-HW3-5
 */
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	Inventory inventory=new Inventory();
    LocalDate date1= LocalDate.of(2020,3,15);
    LocalDate date2=LocalDate.of(2021,3,15);
    LocalDate date3=LocalDate.of(2020,4,1);
    LocalDate date4=LocalDate.of(2020,8,1);
    LocalDate date5=LocalDate.of(2020,1,1);
    LocalDate date6=LocalDate.of(2020,6,1);
    LocalDate date7=LocalDate.of(2021,1,1);
    LocalDate date8=LocalDate.of(2020,2,1);
    LocalDate date9=LocalDate.of(2020,3,1);
    LocalDate date10=LocalDate.of(2020,9,1);
    LocalDate date11=LocalDate.of(2020,1,10);
    LocalDate date12=LocalDate.of(2020,1,25);
    LocalDate date13=LocalDate.of(2020,3,15);
    Product Carrot=new Product("Carrot","Vegtables",5,20,date1,date2);
    Product Apple=new Product("Apple","Fruits",10,50,date3,date4);
    Product Eggs = new Product("12xEggs","Egg",100,40,date5,date6);
    Product Oats=new Product("Oats","Grains",70,100,date6,date7);
    Product Salmon=new Product("Salmon","Seafood",150,250,date5,date8);
    Product Staek=new Product("Steak","Meat",800,1000,date9,date10);
    Product Milk=new Product("Milk","Dairy",100,20,date11,date12);
    Product Cheese =new Product("Cheese","Dairy",150,10,date8,date13);
    inventory.addToList(Carrot);
    inventory.add(Carrot,10);
    inventory.addToList(Apple);
    inventory.add(Apple,50);
    inventory.addToList(Eggs);
    inventory.add(Eggs,20);
    inventory.addToList(Oats);
    inventory.add(Oats,45);
    inventory.addToList(Salmon);
    inventory.add(Salmon,5);
    inventory.addToList(Staek);
    inventory.add(Staek,5);
    inventory.addToList(Milk);
    inventory.add(Milk,20);
    inventory.addToList(Cheese);
    inventory.add(Cheese,50);
    Basket MyBasket=new Basket();
    Scanner input=new Scanner(System.in);
    String what=input.next();
    while (1>0) {
       if(what.equals("add")){
                int add = input.nextInt();
                if (add == 5) {
                    MyBasket.add(Carrot, 1);
                    inventory.Subtract(Carrot, 1);

                }
                if (add == 4) {
                    MyBasket.add(Apple, 1);
                    inventory.Subtract(Apple, 1);
                }
                if (add == 1) {
                    MyBasket.add(Eggs, 1);
                    inventory.Subtract(Eggs, 1);
                }
                if (add == 7) {
                    MyBasket.add(Oats, 1);
                    inventory.Subtract(Oats, 1);
                }
                if (add == 2) {
                    MyBasket.add(Salmon, 1);
                    inventory.Subtract(Salmon, 1);
                }
                if (add == 8) {
                    MyBasket.add(Staek, 1);
                    inventory.Subtract(Staek, 1);
                }
                if (add == 6) {
                    MyBasket.add(Milk, 1);
                    inventory.Subtract(Milk, 1);
                }
                if (add == 3) {
                    MyBasket.add(Cheese, 1);
                    inventory.Subtract(Cheese, 1);
                }
            }
            if(what.equals("remove")){
                int remove = input.nextInt();
                if (MyBasket.products.size() == 0)
                    System.out.println("List is empty.");
                else MyBasket.remove(MyBasket.products.get(remove - 1));
            }
           if(what.equals("products")) {
                if(inventory.empty())
                    System.out.println("We are out of stock.");
               else{
                   System.out.println(inventory.toString());
                   //System.out.println(inventory.plist);
                }
            }
            if(what.equals("checkout")) {
                System.out.println(MyBasket.toString());
                System.out.println("It was a pleasure doing business with you.");
                break;
            }
        what=input.next();
        }

    }

}
