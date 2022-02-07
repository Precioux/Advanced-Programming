package com.company;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Samin Mahdipour
 * @since 12.11.2021
 * AP-WorkShop8
 */
public class Main {
    /**
     *
     * @return true if server is over
     */
    public static boolean check()
    {
        boolean r=false;
        System.out.println("Continue? 1=yes/0=over");
        Scanner scanner=new Scanner(System.in);
        int ans=scanner.nextInt();
        if(ans==1)
            r=true;
        return r;
    }
    public static void main(String[] args) {

            try(ServerSocket server = new ServerSocket(5000);
                Socket socket = server.accept();
                Scanner in = new Scanner(socket.getInputStream());
                Formatter out = new Formatter(socket.getOutputStream());){
                String next="";
                boolean getData=false;
                do{
                    next+= in.next();
                    next+="\n";
                    out.format("Data: \n"+next);
                    out.flush();
                   getData=check();
                }while(!getData);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
