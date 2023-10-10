import java.io.*;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) throws Exception{

        Socket socket = new Socket("localhost", 1234);

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String message  = "Hello! My name is Umer";
        output.write(message);
        output.newLine();
        output.flush();
        String messageFromServer = input.readLine();
        System.out.println(messageFromServer);


        socket.close();
}
}
