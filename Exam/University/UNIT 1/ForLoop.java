class A{
    int a=10;
    void Logic(){
        for(int i=1;i<=a;i++){
        System.out.println("Digit is :"+i);
    }
    }
}

class ForLoop{
    public static void main(String[] args){
        A object1=new A();
        object1.Logic();
    }
}