abstract class A{
    int a=10;
    abstract void display();
}
class B extends A{
    void display(){
        System.out.println("a: "+a);
    }
}
class Abstract{
    public static void main(String[] args){
        B object=new B();
        object.display();
    }
}