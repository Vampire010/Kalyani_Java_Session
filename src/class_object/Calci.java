package class_object;

public class Calci 
{
	public int add()
	{
		System.out.println( "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" );

		int a =10 ;
		int b = 20;
		int c = a+b;
		System.out.println( "A + B : " + c);
		return c;		
	}
	
	
	public String names()
	{
		System.out.println( "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" );		

		String S1 = "Girish";
		System.out.println( S1 );		

		return S1;

	}
	private void mul() 
	{
		System.out.println( "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" );		

		int a =10 ;
		int b = 20;
		int c = a*b;
		System.out.println( "A * B : " + c);
	}
	protected void sub()
	{
		System.out.println( "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" );	

		int a =10 ;
		int b = 20;
		int c = a-b;
		System.out.println( "A - B : " + c);
	}
	//default Modifiers
	void div()
	{
		System.out.println( "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" );	

		int a =10 ;
		int b = 20;
		int c = a/b;
		System.out.println( "A / B : " + c);

	}
	
	public static void main(String[] args) 
	{
		
		Calci a = new Calci();
		a.add();
		a.mul();
		a.div();
		a.sub();
		a.names();

	}

}
