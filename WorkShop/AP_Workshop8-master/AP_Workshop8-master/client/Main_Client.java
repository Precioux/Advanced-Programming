package client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author Samin mahdipour
 * @since 12.11.2021
 * AP-WorkShop-8
 */
public class Main_Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 5000)) {
            BufferedReader response = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter request = new PrintWriter(socket.getOutputStream(), true);
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Data :\nEXIT to finish ");
            String data;
            System.out.print("client :");
            while (true) {
                data = scan.nextLine();
                request.println(data);

                String responseData = response.readLine();
                if (responseData == null) {
                    System.out.println("bye!");
                    break;
                }
                System.out.println("server : " );
                for (String s :responseData.split(" ")){
                    System.out.println(s);
                }

                System.out.print("client:");
            }
            request.close();
            request.close();
            scan.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (ConnectException e) {
            System.out.println("server is unavailable!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
