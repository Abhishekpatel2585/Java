class Bike
{
	final void run()
	{
		System.out.println("running");
	}
}
class Final_Method extends Bike
{
	/* @Override 		run() is declared final so we can not OVERRIDE it
	
	void run()
	{
		System.out.println("running safely with 100kmph");
	}*/
	

	public static void main(String[] args)
	{
		Final_Method mybike=new Final_Method();
		mybike.run();
	}
}