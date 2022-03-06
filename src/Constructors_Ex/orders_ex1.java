package Constructors_Ex;

public class orders_ex1 
{

	public orders_ex1()
	{
		System.out.println("Place Your Order");
	}
	public orders_ex1(String order_item)
	{
		System.out.println("Order is " + order_item);

	}
	public orders_ex1(int Bill)
	{
		System.out.println("Order Bill is " + Bill);

	}
	public orders_ex1(double rating , String feedback)
	{
		System.out.println("rating for service " + rating  + " feedback " + feedback);

	}
	public orders_ex1(String feedback , int rating )
	{
		
	}
	
	
	public static void main(String[] args)
	{
		orders_ex1 ex1 = new orders_ex1();
		orders_ex1 ex2 = new orders_ex1("Idly , Lemaon Rice");
		orders_ex1 ex3 = new orders_ex1(120);
		orders_ex1 ex4 = new orders_ex1( 4.5 ,"Tasty Food");
		

	}

}
