package Exception_Handling_Ex;

public class Exception_Handling_ex1 
{

	public static void main(String[] args) 
	{
       int a = 10;
       int b = 20;
       try
       {
	       int c = a/b;
	       System.out.println(c);
       }
       catch(Exception e)
       {
	       System.out.println("Can't / by zero");
       }
       finally
       {
	       System.out.println("Im Finally");

       }
       int d = a+b;
       System.out.println(d);

	}

}
