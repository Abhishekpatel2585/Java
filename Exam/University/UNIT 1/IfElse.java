class A{
    int age=19;
    void Logic(){
        if(age>=18){
            System.out.println("You are eligible to vote");
        }   
        else{
            System.out.println("You are not eligible to vote");
        }   
    }
}
class IfElse{
    public static void main(String[] args){
        A object1=new A();
        object1.Logic();
    }
}