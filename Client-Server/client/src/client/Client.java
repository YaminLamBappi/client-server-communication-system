package client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client{
    public static void main(String args[])throws IOException {

    Socket socket = new Socket("localhost", 2000);

    DataOutputStream output = new DataOutputStream(socket.getOutputStream());
    System.out.println("Client is Connected");

    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    String str, str1;

    while (!(str = read.readLine()).equals("stop")) {

        output.writeBytes(str + "\n");
        str1 = br.readLine();
        System.out.println("Server Says: "+str1 );
    }socket.close();
    }
}