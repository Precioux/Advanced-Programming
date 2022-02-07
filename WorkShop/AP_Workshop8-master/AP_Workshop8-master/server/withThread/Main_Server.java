package server.withThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
/**
 * @author Samin mahdipour
 * @since 12.11.2021
 * AP-WorkShop-8
 */
public class Main_Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            int i = 0;
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println(i);

                Thread thread = new Thread(new ClientThread(socket), "Client" + i);
                thread.start();
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
