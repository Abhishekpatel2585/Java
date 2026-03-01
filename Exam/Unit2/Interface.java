interface Animal {
    void sound();
}
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
public class Interface {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.sound();
        myCat.sound();
    }
}