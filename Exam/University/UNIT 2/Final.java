final class A{
    final int speed=100;
    speed=200;
    final void display(){
        System.out.println("Speed: "+speed);
    }
}
class B extends A{
    void display(){
        System.out.println("Speed: "+speed);
    }
}

class Final{
    public static void main(String[] args){
        B object=new B();
        object.display();
    }
}