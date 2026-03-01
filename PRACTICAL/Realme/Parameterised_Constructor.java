class mobile{
    int num1 = 10;
    mobile(int a,int b){
        int sum;
        sum=a+b;
        System.out.println("Constructor of mainclass");
    }
    void display(){
        System.out.println("Display of mainclass");
    }
}
class Parameterised_Constructor{
    public static void main(String[] args) {
        mobile obj = new mobile(10,20);
        System.out.println(obj.num1);
        obj.display();
    }
}