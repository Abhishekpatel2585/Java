class A{
    int a=55;
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
class C extends B{
    int c=30;
    void display3(){
        System.out.println("C is :"+c);
    }
}

class MultiLevelInheritance{
    public static void main(String[] args){
        C object1=new C();
        object1.display();
        object1.display2();
        object1.display3();
    }
}