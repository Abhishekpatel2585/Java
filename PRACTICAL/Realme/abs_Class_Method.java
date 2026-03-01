abstract class myclass{
    int Roll_No=55;
    String Name="Abhishek";
    abstract void display();
}
class Sub_class extends myclass{
    @Override
    void display(){
        System.out.println("Roll_No: "+Roll_No);
        System.out.println("Name: "+Name);
    }
}
class abs_Class_Method{
    public static void main(String[] args) {
        Sub_class obj = new Sub_class();
        obj.display();
    }
}