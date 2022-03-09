package Exception_Handling_Ex;

public class throw_ex1 
{
	public static void divideByZero() 
	{
		throw new ArithmeticException("Trying to divide by 0");	
	}
	

	public static void main(String[] args) 
	{
		divideByZero();
	}

}
