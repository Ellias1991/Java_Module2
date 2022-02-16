package lesson6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private static ServerSocket server;
    private static Socket socket;
    private static final int PORT=8189;

    public static void main(String[] args) {
        try{
            server=new ServerSocket(PORT);
            System.out.println("Server started");

            socket=server.accept();
            System.out.println("Client connected");

            Scanner sc= new Scanner(socket.getInputStream());//слушаем входящий канал,те сообщения которые нам напишет клиент,
            // то при помощи чего слушать сообщения,передается инф.в сокет
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);//надо записывать исходящий канал.использует буфер,
            // копит сообщения,как накопит-он их отправляет.В данном случае сразу просим Автофшалем не копить,а отправлять сообщения.
            while (true){
                String str= sc.nextLine();
                if (str.equals("/end")){
                    break;
                }
                System.out.println("Client:"+ str);
                out.println("ECHO:"+ str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
