interface A{
    int a=10;
    void display();
}
class B implements A{
    public void display(){
        System.out.println("FOR EXAMPLE");
    }
}
class Interface{
    public static void main(String[] args){
        B object=new B();
        object.display();
    }
}