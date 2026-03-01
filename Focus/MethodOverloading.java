class Mathematics{
	int a=10;
	int b=20;
	void cal(){
		int sum=a+b;
		System.out.println(sum);
	}
	void cal(int val1,int val2){
		int sum=val1+val2;
		System.out.println(sum);
	}
	void cal(int val1,int val2,int val3){
		int sum=val1+val2+val3;
		System.out.println(sum);
	}
}
class MethodOverloading{
	public static void main(String[] args){
		Mathematics MATHSOBJECT=new Mathematics();
		MATHSOBJECT.cal();
		MATHSOBJECT.cal(50,60);
		MATHSOBJECT.cal(100,110,120);
	}	
}