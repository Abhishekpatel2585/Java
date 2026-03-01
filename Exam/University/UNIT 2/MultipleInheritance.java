interface A{
    int a=10;
    void display();
}
interface B{
    int b=20;
    void display2();
}
class C implements A,B{
    public void display(){
        System.out.println("A IS FOR C CLASS");
    }
    public void display2(){
        System.out.println("B IS FOR C CLASS");
    }
}

class MultipleInheritance{
    public static void main(String[] args){
        C object=new C();
        object.display();
        object.display2();
    }
}