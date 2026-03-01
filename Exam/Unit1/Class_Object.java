class Men{
    String name="John";
    int age=25;
    void speak(){
        System.out.println("My name is "+name+" and I am "+age+" years old.");
    }
}
class Class_Object{
    public static void main(String[] args) {
        Men person1 =new Men();
        System.out.println(person1.name);
        System.out.println(person1.age);
        person1.speak();
    }
}