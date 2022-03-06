package Abstractaction;

public class WhatsApp_V1_Run extends WhatsApp_V1
{

	@Override
	public void text_status() 
	{
		System.out.println("User Able to the WhatsApp Status");
	}

	@Override
	public void text_chat() {
		System.out.println("User Able to Send the Message");

	}
	
	public static void main(String[] args) 
	{
		WhatsApp_V1_Run v1 =new WhatsApp_V1_Run();
		v1.WhatsAPPGO();
		v1.text_chat();
		v1.text_status();
		
	}

	@Override
	public void Audio_call() {
		// TODO Auto-generated method stub
		}

}
