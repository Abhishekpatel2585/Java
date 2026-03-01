class Trial 
{
	int id=52;
	String name="ABHISHEK";
	Trial(int id,String name)
	{
        System.out.println(this.id);
        System.out.println(this.name);
	}
	public static void main(String args[])
	{
        Trial e1 = new Trial(111,"Tom");
        Trial e2 = new Trial(123,"Jerry");
	}
}