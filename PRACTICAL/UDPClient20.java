import java.io.*;
import java.net.*;

public class UDPClient20 {
    public static void main(String[] args) {
        try {
            DatagramSocket s = new DatagramSocket();

            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9876;

            String message = "www.yahoo.com";
            byte[] sendData = message.getBytes();

            DatagramPacket myPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);

            s.send(myPacket);

            System.out.println("Message sent to server: " + message);

            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}