class Main {
    public static void main(String[] args){
        System.out.println("Before 4 Seconds");
        try{
            Thread.sleep(4000);
        }
        catch(InterruptedException e){
            System.out.println("Exception caught");
        }
        System.out.println("After 4 Seconds");
    }
}