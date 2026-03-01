class person{
	String firstname;
	String lastname;
	
	person(String a,String b){
		firstname=a;
		lastname=b;
		
		System.out.println("FIRST NAME IS :"+firstname);
		System.out.println("LASTNAME IS :"+lastname);
	}
}

class ParameterisedConstructor{
	public static void main(String[] args){
		//WHEN OBJECT CREATE PARAMETERISEDCONSTRUCTOR CALL AUTOMATICALLY
		person OBJECT1 = new person("Abhi","Ramani");
	}
}