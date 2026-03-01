class mobile{
    int num1 = 10;
    mobile(){
        System.out.println("Constructor of mainclass");
    }
    mobile(int a,int b){
        int sum;
        sum=a+b;
        System.out.println(sum);
    }
    void display(){
        System.out.println("Display of mainclass");
    }
}
class Constructor_Overloading{
    public static void main(String[] args) {
        mobile obj1 = new mobile();
        mobile obj = new mobile(10,20);
        System.out.println(obj.num1);
        obj.display();
    }
}