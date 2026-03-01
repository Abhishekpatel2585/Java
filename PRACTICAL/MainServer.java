import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class MainServer{
	public static void main(String[] args){
		ServerSocket ss=null;
		Socket s=null;
		DataInputStream Input=null;
		//DataOutputStream Output=null;
		try{
			ss=new ServerSocket(500);
			System.out.println("Server Started....");
			s=ss.accept();
			System.out.println("Client Connected....");
			Input=new DataInputStream(s.getInputStream());
			String msg="";
			
			while(!msg.equals("Bye")){
				msg=Input.readUTF();
				System.out.println(msg);
				int fact=1;
				try{
					
				}catch(Exception e){
					System.out.println(e.toString());
				}
				for(int i=1;i<=msg;i++){
					fact=fact*i;
				}
				System.out.println("FACTORAIL IS : "+fact);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}

