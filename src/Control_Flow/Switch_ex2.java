package Control_Flow;

public class Switch_ex2 {

	public static void main(String[] args) {

		String name = "Kalayani";
		String greetings;
		switch(name)
		{
			case "Girish" :
				greetings="Hello Good Morning";
				break;
			case "Kalayani" :
				greetings="Hello Good Eveing";
				break;
			default:
				greetings="Name is Not in Database";
				break;

		}
        System.out.println(  greetings);

	}

}
