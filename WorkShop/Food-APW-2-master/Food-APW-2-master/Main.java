package com.company;
/**
 * This Project creates a food receipt
 * for AP Workshop-session 2
         * @author Samin Mahdipour
        * @since 10.2.2021
 */
public class Main {

    public static void main(String[] args) {
     Student std1=new Student("Helen","Clark",30);
     Student std2=new Student("James","Williams",60);
     Student std3=new Student("Sarah","Jones",45);
     Restaurant rst1=new Restaurant("Papa Jo","Pizza",15);
     Restaurant rst2=new Restaurant("King Burger","Burger",10);
     Restaurant rst3=new Restaurant("Tokyo","Sushi",30);
     Receipt rcpt1=new Receipt(rst3,std1);
     Receipt rcpt2=new Receipt(rst1,std2);
     Receipt rcpt3=new Receipt(rst2,std3);
     rcpt1.publisher();
     System.out.println();
     rcpt2.publisher();
     System.out.println();
     rcpt3.publisher();

    }
}
