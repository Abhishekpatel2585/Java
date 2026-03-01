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
class C extends A{
    int c=30;
    void display3(){
        System.out.println("C is :"+c);
    }
}

class HierarchicalInheritance{
    public static void main(String[] args){
        B object1=new B();
        object1.display();
        object1.display2();
        C object2=new C();
        object2.display();
        object2.display3();
    }
}