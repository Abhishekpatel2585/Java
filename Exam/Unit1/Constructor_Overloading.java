class Iphone{
    Iphone(String model,int price,String color){
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
        System.out.println("Color: "+color);
    }
    Iphone(String model,int price){
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }
    void display(){
        System.out.println("Construcotr called automatically when object is created");
    }
}
class Constructor_Overloading{
    public static void main(String[] args) {
        Iphone obj = new Iphone("Iphone 12", 799, "Blue");
        obj.display();
        Iphone obj1 = new Iphone("Iphone 12", 799);
        obj1.display();
    }
}