final class Bike
{
	void run()
	{
		System.out.println("running");
	}
}
class Final_Class extends Bike
{
	void run()
	{
		System.out.println("running safely with 100kmph");
	}
	public static void main(String[] args)
	{
		Final_Class mybullet=new Final_Class();
		mybullet.run();
	}
}

// IT THROUGH ERROR BECAUSE FINAL CLASS CAN NOT INHERIT and HERE WE ARE TRYING TO INHERIT THE FINAL CLASS "BIKE"    