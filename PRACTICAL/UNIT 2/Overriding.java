class Animal {
    void sound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override 	//It's not Generating Error It help compiler to Identify that the method is Override
    void sound() { 
        System.out.println("Woof!"); 
    }
}

class Cat extends Animal {
    @Override 
    void sound() { 
        System.out.println("Meow!"); 
    }
}

class Overriding {
    public static void main(String[] args) {
        Animal animal = new Animal(); 
        animal.sound();

        Animal dog = new Dog(); 
        dog.sound();

        Animal cat = new Cat(); 
        cat.sound();
    }
}