package Control_Flow;

public class IF_ex3 {

	public static void main(String[] args) {
		int short_size = 0;
		
		
		if( short_size>=28 & short_size<=31 )
		{
			System.out.println(short_size + " is availble");
		}
		
		else if(short_size>=32 & short_size<=35 )
		{
			System.out.println(short_size + " is availble");
		}
		
		else if(short_size>=36 & short_size<=39)
		{
			System.out.println(short_size + " is availble");
		}
		
		else if(short_size >=40 | (short_size>0 & short_size<27) )
		{
			System.out.println(short_size + " is availble");
		}
		
		else 
		{
			System.out.println(short_size + " Not availble");

		}
	}
}
