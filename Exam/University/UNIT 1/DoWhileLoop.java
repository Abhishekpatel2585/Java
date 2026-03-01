class A{
    int a=10;
    void Logic(){
        int i=1;
        do{
            System.out.println("Digit is :"+i);
            i++;
        }while(i<=a);
    }
}
class DoWhileLoop{
    public static void main(String[] args){
        A object1=new A();
        object1.Logic();
    }
}