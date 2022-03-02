package Control_Flow;

public class IF_ex1 
{
	public static void main(String[] args) 
	{
		String user_name = "Girish G";
		String user_name_if = "Girish";
		String user_name2 = "Kalayanis";

		if(user_name.equals(user_name_if))
		{
			System.out.println("Hello " +user_name);
		}
		else if(user_name2.equals("Kalayani"))
		{
			System.out.println("Hello " +user_name2);
		}
		else
		{
			System.out.println("user_name Not Found ");
		}
	}
}
