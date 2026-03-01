class myclass{
    void display(){
        System.out.println("Charger");
    }
}
class  sub_class extends myclass{
    void display1(){
        System.out.println("Earphones");
    }
}
class Single_Inheritance{
    public static void main(String[] args){
        sub_class obj=new sub_class();
        obj.display();
        obj.display1();
    }
}