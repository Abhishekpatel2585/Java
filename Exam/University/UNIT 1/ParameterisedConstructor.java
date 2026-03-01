class MeWithBag{
    MeWithBag(String name,int price){
        System.out.println("Bag name is :"+name+" and it costs for :"+price);
    }
}
class ParameterisedConstructor{
    public static void main(String[] args){
        MeWithBag bag1=new MeWithBag("Skybag",2000);
    }
}