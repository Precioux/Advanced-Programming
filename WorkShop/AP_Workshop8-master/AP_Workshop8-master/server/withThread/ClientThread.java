package server.withThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
/**
 * @author Samin mahdipour
 * @since 12.11.2021
 * AP-WorkShop-8
 */
public class ClientThread implements Runnable {
    private Socket socket;
    private String inputs="";
    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader request = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter response = new PrintWriter(socket.getOutputStream(), true);

            String requestData;
            System.out.println("server is available");
            while (!(requestData = request.readLine()).equals("EXIT")) {
                this.inputs+=requestData+" ";
                response.println( inputs);
            }
            System.out.println("Client is gone!");
            response.close();
            request.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
