import java.net.*;
import java.io.*;

class ServerDemo1{
		
		public static void main(String[] args){
			ServerSocket ss=null;
			Socket s=null;
			DataInputStream Input=null;
			try{
				ss=new ServerSocket(25);
				s=ss.accept();
				Input=new DataInputStream(s.getInputStream());
				String msg="";
				while(!msg.equals("Bye")){
					msg=Input.readUTF();
					System.out.println(msg);
				}
				
			}catch(Exception e){
				System.out.println(e.toString());
			}
		}
	
}