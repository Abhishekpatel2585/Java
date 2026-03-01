class Arithmatic{
	int sum,a=100,b=100;
	void sum(){
		sum=a+b;
		System.out.println("Sum is : " + sum);
	}
	void sum(int P1,int P2){
		int var1 , var2;
		var1=P1;
		var2=P2;
		int sum=var1+var2;
		System.out.println("Sum is : " + sum);
	}
	void sum(int M1,int M2,int M3){
		int X,Y,Z;
		X=M1;
		Y=M2;
		Z=M3;
		int sum=M1+M2+M3;
		System.out.println("Sum is : " + sum);
	}
}
class Method_Overloading{
	public static void main(String[] args){
		Arithmatic A1=new Arithmatic();
		A1.sum();
		A1.sum(22,33);
		A1.sum(10,20,30);
	}
}