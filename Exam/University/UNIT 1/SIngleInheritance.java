class A{
    int a=10;
    void display(){
        System.out.println("A is :"+a);
    }
}
class B extends A{
    int b=20;
    void display2(){
        System.out.println("B is :"+b);
    }
}

class SIngleInheritance{
    public static void main(String[] args){
        B object1=new B();
        object1.display();
    }
}