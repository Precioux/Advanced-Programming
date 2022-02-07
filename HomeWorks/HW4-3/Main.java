package com.company;

/**
 * @author Samin Mahdipour
 * @since 11.6.2021
 * AP-HW4-Q3
 */
import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu m=new Menu();
        FreightAgancy freightAgancy=new FreightAgancy();

        m.print();
        Scanner input = new Scanner(System.in);
        int choice=input.nextInt();
        int back;
        while (choice!=5) {
            if(choice==0){
                m.print();
            choice=input.nextInt();
            }
            if(choice==1) {
                back=freightAgancy.printAll();
                if(back==0)
                    choice=0;
            }
            if(choice==2)
            {
                back = freightAgancy.clientsPrint();
                if(back==0)
                    choice=0;

            }
            if(choice==3){
                back=freightAgancy.add();
                if(back==0)
                    choice=0;
            }

            if(choice==4) {
                back=freightAgancy.clientAdder();
                if(back==0)
                    choice=0;
            }
           /* switch (choice) {
                case 0: {
                    m.print();
                    choice=input.nextInt();
                }
                case 1: {
                    freightAgancy.printAll();
                    break;
                }
                case 2: {
                    beck = freightAgancy.clientsPrint();
                    if(beck==0)
                        choice=0;
                }
                case 3: {
                    freightAgancy.add();
                    break;
                }
                case 4: {
                    freightAgancy.clientAdder();
                    break;
                }
            }*/
        }

    }
}
