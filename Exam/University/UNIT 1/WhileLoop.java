class A{
    int a=10;
    void Logic(){
        int a=10;
        int i=1;
        while(i<=a){
            System.out.println("Digit is :"+i);
            i++;
        }
    }
}

class WhileLoop{
    public static void main(String[] args){
        A object1=new A();
        object1.Logic();
    }
}