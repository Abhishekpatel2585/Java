class Men{
    String name="John";
    int age=25;
    void speak(){
        System.out.println("My name is "+name+" and I am "+age+" years old.");
    }
}
class Multiple_object{
    public static void main(String[] args) {
        Men person1 =new Men();
        person1.speak();
        Men person2 =new Men();
        person2.speak();
    }
}