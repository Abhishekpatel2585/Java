class Keyboard{
	int key=32;
	String Company="RedGear";
	Keyboard(){
		System.out.println("KEY COUNT IS :"+ key);
		System.out.println("COMPANY NAME IS : " + Company);
	}
}

class Constructor{
	public static void main(String[] args){
		Keyboard k1=new Keyboard();
		System.out.println("Constructor call automatically When object is created , \n I didn't create Call it");
	}
}