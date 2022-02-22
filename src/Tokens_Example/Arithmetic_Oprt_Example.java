package Tokens_Example;

public class Arithmetic_Oprt_Example 
{

	public static void main(String[] args) 
	{
		int NUM_1= 10;
		int NUM_2 = 20;
		//addition
		int add_Op_result = NUM_1 + NUM_2 ;
		//NUM_2=NUM_1+NUM_2
		System.out.println("add_Op_result = " + add_Op_result);
	
		//multiplication
		int mul_Op_result = NUM_1 * NUM_2 ;
		System.out.println("mul_Op_result = " + mul_Op_result);
		
		//Division
		double div_Op_result = NUM_2 / NUM_1 ;
		System.out.println("div_Op_result = " + div_Op_result);
		
		//substraction
		int sub_Op_result = NUM_1 - NUM_2 ;
	    System.out.println("sub_Op_result = " + sub_Op_result);
		
		//PER%
		double per_Op_result = NUM_1 % NUM_2 ;
		System.out.println("per_Op_result = " + per_Op_result);
	    
	    
	}

}
