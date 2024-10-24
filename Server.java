package chatapp;

import java.io.IOException;
import java.net.*;
import java.io.*;


 public class Server {


 public static void main(String[] args) {
       try {
           System.out.println("server is ready to accept connect");
                System.out.println("waiting....");

        ServerSocket server=new ServerSocket(9806);
               Socket socket=server.accept();
                System.out.println("connection established....");
BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
      String str=in.readLine();
      PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
      out.println("Server says "+ str);
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
       
}
 }
