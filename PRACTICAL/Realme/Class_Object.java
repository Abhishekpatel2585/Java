class Trial{
    int a=10;
    void display(){
        System.out.println("Value of a is "+a);
    }
}
class Class_Object{
    public static void main(String[] args){
            Trial t1=new Trial();
            int b=t1.a;
            System.out.println(b);
    }
}