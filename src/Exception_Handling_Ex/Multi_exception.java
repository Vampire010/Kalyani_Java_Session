package Exception_Handling_Ex;

public class Multi_exception 
{
	
	public static void main(String[] args) 
	{
		   int a = 10;
	       int b = 0;
	       int[] arr = {22,25,28};
	       try
	       {
		       int c = a/b;
		       System.out.println(c);
		       System.out.println(arr[3]);

	       }
	       catch(ArithmeticException e)
	       {
		       System.out.println("Can't / by zero");
	       }

	       catch(ArrayIndexOutOfBoundsException e)
	       {
		       System.out.println("ArrayIndexOutOfBoundsException");
	       }

	
	}

}
