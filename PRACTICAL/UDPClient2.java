import java.io.*;
import java.net.*;
import java.util.Scanner;

public class UDPClient2 {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            Scanner sc = new Scanner(System.in);

            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9876;

            System.out.print("Enter a number: ");
            String number = sc.nextLine();

            byte[] sendData = number.getBytes();

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
            socket.send(sendPacket);
            System.out.println("Number sent to server.");

            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);

            String factorial = new String(receivePacket.getData()).trim();
            System.out.println("Factorial received from server: " + factorial);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
