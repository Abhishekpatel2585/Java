class myclass{
    void add(){
        int a=9,b=10,res;
        res=a+b;
        System.out.println(a + "+" + b + "=" + res);
    }
    void add(int x,int y){
        int res=x+y;
        System.out.println(x + "+" + y + "=" + res);
    }
}
class methodoverloading{
    public static void main(String[] args){
        myclass obj=new myclass();
        obj.add();
        obj.add(10,20);
    }
}