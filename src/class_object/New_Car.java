package class_object;

public class New_Car 
{

	public void old_car_beh()
	{
		Old_Car ol = new Old_Car();
		ol.Engine_status_1();
		ol.Engine_status_2();
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println( "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" );
		New_Car car_ref = new New_Car();
		car_ref.old_car_beh();
		
		System.out.println( "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$" );
		Old_Car ol = new Old_Car();
		ol.Engine_status_1();
		ol.Engine_status_2();
	}

}
