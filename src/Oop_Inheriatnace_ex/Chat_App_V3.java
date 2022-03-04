package Oop_Inheriatnace_ex;

public class Chat_App_V3  extends Chat_App_V2
{
	public void Video_calling()
	{
		System.out.println(" I can make Video_calling");
	}
	

	public static void main(String[] args) {
		Chat_App_V3 v3 = new Chat_App_V3();
		v3.send_message();
		v3.Audio_calling();
		v3.Video_calling();
	}

}
