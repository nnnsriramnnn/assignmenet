package methodOverriding;
import inheritance.Overriding;

/* Requirement: Perform method overriding
 * 
 *  Step 1: inheritance must be performed
 *  
 *  Step 2: Method signature must be same as super class
 *  
 *  Step 3: Only implementation part in inherited method should be different
 *  
 *  Same action performed in different ways or having different implementations
 *  
 *  Changing the implementation part of superclass method in sub-class is method overriding*/

class AA{
	public void move()
	{
		System.out.println("Move to north");
	}
}
class BB extends AA
{
	
}
class CC extends AA
{
  @Overriding   //Overriding in hierarchical inheritance 
public void move()
{
   System.out.println("Move to south");	
}
}
class DD extends CC  //Overriding in multi-level inheritance
{
	@Overriding 
	public void move()
	{
	System.out.println("Move to west");
	}
}
public class MethodOverriding {
	
	public static void main(String [] args) {
		
	System.out.println("Main Begin");
		
		BB bb1 = new BB();
		CC cc1 = new CC();
		DD dd1 = new DD();
		bb1.move();
		cc1.move();
		dd1.move();
		
	System.out.println("Main Finish");
	}

}
