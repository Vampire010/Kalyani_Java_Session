package Oop_Inheriatnace_ex;

public class GPayment_App_V1 extends Chat_App_V1
{
	public void send_money()
	{
		System.out.println(" I can  send_money");
	}
	public void revice_money()
	{
		System.out.println(" I can  revice_money");
	}
	

	public static void main(String[] args) 
	{
		GPayment_App_V1 v1 = new GPayment_App_V1();
		v1.send_message();
		v1.send_money();
		v1.revice_money();
	}

}
