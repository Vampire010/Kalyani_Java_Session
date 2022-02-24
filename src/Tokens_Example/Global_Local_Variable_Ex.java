package Tokens_Example;

public class Global_Local_Variable_Ex 
{
	// Global Variable
	int a = 10;
	int b= 20;
	
	
	public void Addition()
	{
		// Local Variable
		int c = a+b;
		System.out.println( c );
	}
	
	public void Mul()
	{
		// Local Variable
		 int d = a * b;
		 // int r  = c - 10;  
		System.out.println( d );
	}
	
	
	public static void main(String[] args) 
	{
		//creating an Object
		Global_Local_Variable_Ex gbx = new Global_Local_Variable_Ex();
		gbx.Addition();
		gbx.Mul();
		
	}

}
