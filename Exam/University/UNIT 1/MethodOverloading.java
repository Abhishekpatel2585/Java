class arithmatic{
    void sum(){
        int a=10,b=20;
        int c=a+b;
        System.out.println("Sum of two numbers is: "+c);
    }
    void sum(int a,int b){
        int c=a+b;
        System.out.println("Sum of two numbers is: "+c);
    }
    void sum(int a,int b,int c){
        int d=a+b+c;
        System.out.println("Sum of the two numbers is: "+d);
    }
}
class MethodOverloading{
    public static void main(String[] args){
        arithmatic a1=new arithmatic();
        a1.sum();
        a1.sum(110,120);
        a1.sum(150,160,1710);
    }
}