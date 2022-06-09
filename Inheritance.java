package inheritance;
/* Requirement:
 * 
 * 1. Perform single inheritance - One subclass inheriting members from it's super class.
 * 
 * 2. Perform multi-level inheritance - Super class inherited by subclass. Inherited sub-class inherited by another subclass.
 * 
 * 3. Perform hierarchical inheritance - Multiple sub-classes inherited one super-class*/

class A
{
	public int a = 8;
}

// Till here single level inheritance: Subclass B inheriting superclass A
class B extends A
{
	public int b = 9;
	
	public void show()
	{
		System.out.println("");
		System.out.println("Single level inheritance performance");
		System.out.println("Super class variable value is: "+a);
		System.out.println("Sub class variable value is: "+b); 
		System.out.println("");
	}
}

//Till here multi-level inheritance: Subclass C inheriting it's superclass B. Subclass B inheriting superclass A 
class C extends B
{
	public int c = 10;
	
	public void show()
	{
		System.out.println("");
		System.out.println("Multi level inheritance performance");
		System.out.println("Super class A variable value is: "+a);
		System.out.println("Sub class B variable value is: "+b);
		System.out.println("Sub class C variable value is: "+c);
		System.out.println("");
	}
}

//At present we are performing hierarchical inheritance: Subclass D and B inheriting it's same superclass A.
class D extends A
{
	public int d = 12;
	
	public void show()
	{
		System.out.println("");
		System.out.println("Hierarchical level inheritance performance");
		System.out.println("Super class A variable value is: "+a);
		System.out.println("Sub class C variable value is: "+d);
		System.out.println("");
	}
}

public class Inheritance {
	
	public static void main(String [] args) {
	
	//excecuting class B to perform single_level inheritance
	B b1 = new B();
	b1.show();
	
	//executing class C to perform multi_level inheritance
	C c1 = new C();
	c1.show();
	
	//executing class D to perform hierarchical_level inheritance
		D d1 = new D();
		d1.show();
	
	}

}
