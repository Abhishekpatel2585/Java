class GrandParent_class{
	int Rupees=36000000;
	String Banglow="Antilia";
	
	void Property(){
		System.out.println("Rupees are :" + Rupees);
		System.out.println("Banglow is : " + Banglow);
	}
}
class Parent_class extends GrandParent_class{
	void Cycle(){
		System.out.println("I've Cycle");
	}
}

class Child extends Parent_class{
	void walk(){
		System.out.println("I'm going through Walk ");
	}
}

class MultiLevel_Inheritance{
	public static void main(String[] args){
		Child Aman=new Child();
		Aman.walk();
		Aman.Cycle();
		Aman.Property();
	}
}