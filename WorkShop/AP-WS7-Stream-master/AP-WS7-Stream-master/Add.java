package com.company;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Add class
 * @author Samin Mahdipour
 * @version 1.0
 * @since 5.8.2021
 * AP-workshop- 7-FileInputStream/OutputStream
 * */
public class Add {
    protected String summery="";

    /**
     * Starts to add a note
     */
    public void Start()
    {
        System.out.println("Enter Title: ");
        Scanner scanner=new Scanner(System.in);
        String title=scanner.next();
        File newfile = new File("C:\\Users\\Lenovo\\IdeaProjects\\WS7\\Notes\\"+title+".txt");
        System.out.println("add a Summery: ");
        Scanner scan1 = new Scanner(System.in);
        summery+=scan1.nextLine();
        writeSummery(summery);
        System.out.println("Your Note is Ready! Go on:");
        String note="";
        note+=scan1.nextLine();
        scan1.close();
           try {

                    FileOutputStream fWriter = new FileOutputStream(newfile);
                    byte[] by=note.getBytes(StandardCharsets.UTF_8);
                    fWriter.write(by);
                    System.out.println("File is created successfully with the content.");
                    fWriter.close();
                }
                catch (IOException e) {
                    System.out.print(e.getMessage());
                }

            }

    /**
     *
     * @param summery given by user
     */
    public void writeSummery(String summery)
            {
                File file = new File("C:\\Users\\Lenovo\\IdeaProjects\\WS7\\Summery.txt");
                FileOutputStream writer;
                try {
                    writer = new FileOutputStream(file, true);
                    byte[] b=("* "+summery+"\n").getBytes(StandardCharsets.UTF_8);
                    writer.write(b);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

