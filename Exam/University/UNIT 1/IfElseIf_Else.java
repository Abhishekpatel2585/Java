class A{
    int a=10;
    void Logic(){
        if(a==0){
            System.out.println("A is :"+a);
        }
        else if(a<=1){
            System.out.println("A is :"+a);
        }
        else{
            System.out.println("A is :"+a);
        }
    }
}
class IfElseIf_Else{
    public static void main(String[] args){
        A object1=new A();
        object1.Logic();
    }
}