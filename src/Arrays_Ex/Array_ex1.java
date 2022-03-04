package Arrays_Ex;

public class Array_ex1
{

	public static void main(String[] args) 
	{
		int[] arr = new int[5];
		arr[0]=13;
		arr[1]= 11;
		arr[2]=9;
		arr[3]=10;
		arr[4]=3;
		System.out.println(arr[1]);
		System.out.println(arr[4]);
		//System.out.println(arr[5]);

		int[] evn_num = { 2,4,6,8,10,};
		System.out.println(evn_num[1]);
		System.out.println("**************");

		for(int i : evn_num )
		{
			System.out.print(i + " ");
		}
		
		System.out.println("**************");
		String[] names = {"john" , "Matt" , "Nick" , "Polo"};
		System.out.println(names[1]);
		System.out.println("**************");

		for(String i : names )
		{
			System.out.print(i + " ");
		}
		
	}

}
