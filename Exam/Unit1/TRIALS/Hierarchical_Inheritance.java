class A{
    int a=10;
    void add(){
        System.out.println(a);
    }
}

class B extends A{
    int b=20;
    void display(){
        System.out.println(b);
    }
}

class C extends A{
    int c=30;
    void show(){
        System.out.println(c);
    }
}

class Hierarchical_Inheritance{
    public static void main(String[] args){
        B b1=new B();
        C c1=new C();
        b1.add();
        b1.display();
        c1.add();
        c1.show();
    }
}