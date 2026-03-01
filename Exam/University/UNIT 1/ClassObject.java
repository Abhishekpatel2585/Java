class trail{
    int id=55;
    String name="Sai";
    void display(){
        System.out.println(id+" "+name);
    }
}
class ClassObject{
    public static void main(String[] args){
        trail t1=new trail();
        t1.display();
    }
}