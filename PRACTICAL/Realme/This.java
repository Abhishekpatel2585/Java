class myclass{
    int id=55;
    String name="Sachin";
    void display(int id, String name){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(id);
        System.out.println(name);
    }
}
class This{
    public static void main(String[] args) {
        myclass obj = new myclass();
        obj.display(100, "Rahul");
    }
}