package chatapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class client {
    public static void main(String[] args) {
       try{
        System.out.println("client is going to start");
       Socket socket=new Socket("localhost",9806);
       BufferedReader userInput=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter a string");
       String str=userInput.readLine();
       PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
       out.println(str);
       BufferedReader in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
       System.out.println(in.readLine());
    }

catch(Exception e){
    e.printStackTrace();
}
}
}
