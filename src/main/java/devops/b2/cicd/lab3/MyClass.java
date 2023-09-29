package devops.b2.cicd.lab3;

public class MyClass {
	public void greeting()
	{
		System.out.println("Hello GitHub Actions");
	}
	public void testMsg()
	{
		System.out.println("This is Test Message");
	}

	public static void main(String[] args) {		
		MyClass ob = new MyClass();
		ob.greeting();
	}

}
