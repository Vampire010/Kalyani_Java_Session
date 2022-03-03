package Control_Flow;

public class For_Ex3 
{

	public static void main(String[] args) 
	{
		int temp = 5;

		for(int i = 1; i<=5 ; i++)
		{
			for(int j=temp ; j>=i ; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
