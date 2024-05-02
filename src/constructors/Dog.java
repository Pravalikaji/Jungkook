package constructors;

public class Dog {
	
	String dname;    //non static variable
	           
	public Dog()     //no args constructor
	{
	dname="Tommy";
	}
	public static void main(String args[])
	{
	//class name ref = new constructor();
	Dog r1 = new Dog(); 
	System.out.println(r1.dname);
	}
	} 









