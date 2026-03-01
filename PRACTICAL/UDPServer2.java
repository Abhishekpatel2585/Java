import java.io.*;
import java.net.*;

public class UDPServer2 {
    public static void main(String[] args) {
        try {
            DatagramSocket ss = new DatagramSocket(9876);
            System.out.println("Server started. Waiting for a client...");

            while (true) {
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

                ss.receive(receivePacket);
                String data = new String(receivePacket.getData(), 0, receivePacket.getLength());
                int num = Integer.parseInt(data);

                System.out.println("Number received from client: " + num);

                long fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }

                String result = String.valueOf(fact);
                byte[] sendData = result.getBytes();

                InetAddress clientIP = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientIP, clientPort);
                ss.send(sendPacket);

                System.out.println("Factorial sent to client: " + fact);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
