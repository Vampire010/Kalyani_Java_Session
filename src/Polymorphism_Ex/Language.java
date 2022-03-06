package Polymorphism_Ex;

public class Language extends Pattern
{
	
	  // method without parameter
	    @Override
		 public void display() 
		 {
			    for (int i = 0; i < 5; i++) 
			    {
			      System.out.println("Girish Java");
			    }
		 }

	public static void main(String[] args) 
	{
		Language l = new Language();
		l.display();
	}

}
