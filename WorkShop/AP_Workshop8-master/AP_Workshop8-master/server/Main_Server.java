package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * @author Samin mahdipour
 * @since 12.11.2021
 * AP-WorkShop-8
 */
public class Main_Server {
    public static void main(String[] args) {
        String inputs="";
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            Socket socket =serverSocket.accept();
            BufferedReader request = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter response = new PrintWriter(socket.getOutputStream(), true);
            String requestData;
            System.out.println("server is available");
            boolean check=true;
            while (check) {
                requestData= request.readLine();
                if(requestData.equals("EXIT"))
                   check=false;
                    else{
                    inputs += requestData + " ";
                    response.println(inputs);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("server is unavailable");
        }
    }
}
