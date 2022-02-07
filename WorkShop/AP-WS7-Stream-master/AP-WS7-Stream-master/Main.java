package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author Samin Mahdipour
 * @version 1.0
 * @since 5.8.2021
 * AP-workshop- 7-FileInputStream/OutputStream
 * */
public class Main {
    /**
     *
     * @throws IOException check
     */
   public static void menu() throws IOException {
       File folder = new File("C:\\Users\\Lenovo\\IdeaProjects\\WS7\\Notes\\");
       System.out.println("1-Add\n2-Summery\n3-Open a Note\n4-Remove a Note");
       Scanner choice=new Scanner(System.in);
       String[] name=folder.list();
       int c=choice.nextInt();
       switch (c)
       {
           case 1:
           {
               Add add=new Add();
               add.Start();
               break;
           }
           case 2:
           {
               FileInputStream fs = new FileInputStream("Summery.txt");
               ArrayList <Integer> lst=new ArrayList<>();
               try {
                   int bCode;
                   while (-1 != (bCode = fs.read()))
                       lst.add((int) bCode);
               }
               catch (IOException exception)
               {
                   exception.printStackTrace();
               }
               finally {
                   fs.close();
                   for (int b:lst ){
                       System.out.print((char) b);
                   }
               }
               break;
           }
           case 3:
           {

               for (String n:name) {
                   System.out.println(n);
               }
               System.out.println("Which File?" );
               String f=choice.next();
               File p=new File("C:\\Users\\Lenovo\\IdeaProjects\\WS7\\Notes\\"+f+".txt");
               FileInputStream fin = new FileInputStream(p);
               List <Integer> list=new ArrayList<>();
               try {
                   int bCode;
                   while (-1 != (bCode = fin.read()))
                       list.add((int) bCode);
               }
               catch (IOException exception)
               {
                   exception.printStackTrace();
               }
               finally {
                   fin.close();
                   for (int a:list) {
                       System.out.print((char) a);
                   }
               }
               break;
           }
           case 4:
           {
               for (String n:name) {
                   System.out.println(n);
               }
               System.out.println("Which File?" );
               String f=choice.next();
               File p=new File("C:\\Users\\Lenovo\\IdeaProjects\\WS7\\Notes\\"+f+".txt");
               if(p.delete())
               {
                   System.out.println("File deleted successfully");
               }
               else
               {
                   System.out.println("Failed to delete the file");
               }
               break;
           }
           default:
               throw new IllegalStateException("Unexpected value: " + c);
       }
   }
    public static void main(String[] args) throws IOException {
      menu();
    }
}