import java.io.*;
import java.net.*;

class ServerProgram{
	public static void main(String[] args){
		ServerSocket ss=null;
		Socket s=null;
		DataInputStream Input=null;
		try{
			ss=new ServerSocket(25);
			s=ss.accept();
			Input=new DataInputStream(s.getInputStream());
			String msg="";
			while(!msg.equalsIgnoreCase("Bye")){
				msg=Input.readUTF();
				System.out.println(msg);
				try{
					int number=Integer.parseInt(msg);
					System.out.println(number);
				}catch(NumberFormatException e){
					
				}
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}