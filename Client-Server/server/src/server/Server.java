
package server;
/**
 *
 * @author yamin
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String args[])throws IOException{
    ServerSocket ss = new ServerSocket(2000);
    
    Socket socket = ss.accept();
    System.out.println("Connection established");

    PrintStream send = new PrintStream(socket.getOutputStream());
    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
            String str, str1;

            while ((str = br.readLine()) != null) {
                    System.out.println("Client Says: "+str );
                    str1 = read.readLine();               
                    send.println(str1);
            }ss.close();
            socket.close();

            System.exit(0);
    } 
    }
}