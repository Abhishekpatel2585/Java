import java.io.*;
import java.net.*;

public class UDPServer20 {
    public static void main(String[] args) {
        try {
            DatagramSocket ss = new DatagramSocket(9876);
			
            System.out.println("Server started. Waiting for a client...");

            byte[] receiveData = new byte[1024];

            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

            ss.receive(receivePacket);

            String data = new String(receivePacket.getData(),0,receivePacket.getLength());
            
            System.out.println("IP Address of:" + data + "is=");
			System.out.println(InetAddress.getByName(data).getHostAddress());
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}