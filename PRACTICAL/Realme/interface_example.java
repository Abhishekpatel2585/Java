interface car{
    int Number_plate = 1234;
    String Car_name = "BMW";
}
class interface_example implements car{
    public static void main(String[] args) {
        System.out.println("Number_plate: "+Number_plate);
        System.out.println("Car_name: "+Car_name);
    }
}