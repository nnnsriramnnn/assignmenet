package methodOverloading;
/*Requirement: With in the same class
 * 
 *Step 1: Implement methods with same name 
 *
 *Implementing methods with same name in within the same class is method overloading*/

class MethodOverloading {
	public static void main(int a)
	{
		System.out.println("The number is: " +a);
	}
	public void main (String name)
	{
		System.out.println(name);
	}

public static void main (String [] args)
{
	System.out.println("main begins");
	main(8);
	MethodOverloading m1 = new MethodOverloading();
	m1.main("The persson name is: Nidamanuri Sriram");
	System.out.println("main finish");
}
}
