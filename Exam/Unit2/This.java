class This
{
	int id;
	String name;
	This(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	void show()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
		This e1 = new This(111,"Tom");
		This e2 = new This(112,"Jerry");
		e1.show();
		e2.show();
	}
}