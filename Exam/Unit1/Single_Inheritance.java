class Papa{
    void Car(){
        System.out.println("Papa class method");
    }
}
class Child extends Papa{
    void Bike(){
        System.out.println("Child class method");
    }
}
class Single_Inheritance{
    public static void main(String[] args) {
        Child Aman = new Child();
        Aman.Car();
        Aman.Bike();
    }
}