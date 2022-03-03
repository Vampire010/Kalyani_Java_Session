package Control_Flow;

public class For_If_Ex4 {

	public static void main(String[] args) {
		for(int i =1 ; i<=1000;i++)
		{
			if(i>400 && i<900)
			{
				continue;
			}
			System.out.println(i);

		}
	}

}
