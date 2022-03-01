package class_object;

public class Old_Car 
{
		public void Engine_status_1()
		{
			System.out.println( "Car Engine  :   " +  "   Engine is ON  " );
		}
		
		public void Engine_status_2()
		{
			System.out.println( "Car Engine  :   " +  "   Engine is OFF  " );
		}
		
		//static method
		public static void simple()
		{
			System.out.println( "Car Static Method " );
		}

	// main method
	public static void main(String[] args)
	{
		//Object of Class
		Old_Car c =  new Old_Car();
		c.Engine_status_1();
		c.Engine_status_2();
		
		//calling static method
		 simple();
		 
	     /*
	      //calling non-static method
		  Engine_status_2();    */
		
	}
}
