class Iphone{
    String model;
    int price;
    String color;
    Iphone(){
        model = "Iphone 12";
        price = 799;
        color = "Blue";
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
        System.out.println("Color: "+color);
    }
    void display(){
        System.out.println("Construcotr called automatically when object is created");
    }
}
class Default_Constructor{
    public static void main(String[] args) {
        Iphone obj = new Iphone();
        obj.display();
    }
}