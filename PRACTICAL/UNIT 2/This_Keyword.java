class This_Keyword
{
	int id;
	String name;
	This_Keyword(int id,String name)
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
		This_Keyword e1 = new This_Keyword(111,"Tom");
		This_Keyword e2 = new This_Keyword(112,"Jerry");
		e1.show();
		e2.show();
	}
}