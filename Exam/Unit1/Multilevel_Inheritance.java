class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}
class Puppy extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.weep();
        puppy.bark();
        puppy.eat();
    }
}