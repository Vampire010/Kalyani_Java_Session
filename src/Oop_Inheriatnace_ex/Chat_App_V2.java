package Oop_Inheriatnace_ex;

public class Chat_App_V2 extends Chat_App_V1
{

	public void Audio_calling()
	{
		System.out.println(" I can make Audio_calling");
	}
	
	public static void main(String[] args) 
	{
		Chat_App_V2 v2 = new Chat_App_V2();
		v2.send_message();
		v2.Audio_calling();
	}

}
