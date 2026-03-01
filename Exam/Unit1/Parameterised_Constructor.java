class Iphone{
    Iphone(String model,int price,String color){
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
        System.out.println("Color: "+color);
    }
    void display(){
        System.out.println("Construcotr called automatically when object is created");
    }
}
class Parameterised_Constructor{
    public static void main(String[] args) {
        Iphone obj = new Iphone("Iphone 12", 799, "Blue");
        obj.display();
    }
}