package Interface_EX;

public class Interface_to_class_ex2 implements Interface_ex2
{
	@Override
	public void add() {

		System.out.println("*****************");
	}

	@Override
	public void mul() {
		System.out.println("*****************");
		
	}

	@Override
	public void sub() {
		System.out.println("*****************");
		
	}

	public static void main(String[] args) 
	{
		Interface_to_class_ex2 ex2 = new Interface_to_class_ex2();
		ex2.add();
		ex2.sub();
		ex2.mul();
	}

	

}
