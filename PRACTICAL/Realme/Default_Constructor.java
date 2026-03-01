class mobile{
    int num1 = 10;
    mobile(){
        System.out.println("Constructor of mainclass");
    }
    void display(){
        System.out.println("Display of mainclass");
    }
}
class Default_Constructor{
    public static void main(String[] args) {
        mobile obj = new mobile();
        System.out.println(obj.num1);
        obj.display();
    }
}