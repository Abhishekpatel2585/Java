class Arithmetic{
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
class Method_Overloading{
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
}