import java.io.*;
import java.net.*;

class Server{
	public static void main(String[] args){
		ServerSocket ss=null;
		Socket s=null;
		DataInputStream Input=null;
		try{
			ss=new ServerSocket(1025);
			System.out.println("SERVER STARTED...");
			s=ss.accept();
			Input=new DataInputStream(s.getInputStream());
			System.out.println("CLIENT CONNECTED...");
			String msg="";
			while(!msg.equals("Bye")){
				msg=Input.readUTF();
				System.out.println(msg);
				try{
					int n=Integer.parseInt(msg);
					int count=0;
					for(int i=1;i<=n;i++){
						if(n%i==0){
							count++;
						}
					}
					if(count==2){
						System.out.println("PRIME");
					}
					else{
						System.out.println("NON PRIME");
					}
				}catch(Exception e){
					System.out.println(e.toString());
				}
			}
		}catch(IOException e){
			System.out.println(e.toString());
		}
	}
}

//PRIME 