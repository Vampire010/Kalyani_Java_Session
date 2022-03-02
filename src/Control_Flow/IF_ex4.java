package Control_Flow;

public class IF_ex4 
{

	public static void main(String[] args) 
	{
		int num  = 0;
		if( num>=1 & num<=100 )
		{
			if(num%2==0)
			{
				System.out.println(num + " is even");
				if(num>=1 & num<=10)
				{
					System.out.println(num + " is even its Less than 10");
				}
				else if( num>10 & num<=100 )
				{
					System.out.println(num + " is even its grater than 10");
				}
			}			
			else if(num%2!=0)
			{
				System.out.println(num + " is odd");
			}			
		}
		
		else
		{
			System.out.println(" Enter Valid Number between 1 to 100 ");
		}
		
	}

}
