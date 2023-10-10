import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) throws Exception{

        ServerSocket serversocket = new ServerSocket(1234);
        Socket socket = serversocket.accept();
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String messageFromClient = input.readLine();
        System.out.println(messageFromClient);
        String name = messageFromClient.split(" ")[messageFromClient.split(" ").length - 1];
        String messageToClient = "Walaikum Assalam " + name;
        output.write(messageToClient);
        output.newLine();
        output.flush();
        socket.close();

    }
}