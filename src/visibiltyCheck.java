/** 6) Create object for a class which implements two interfaces and an abstract class
 *  and verify the visibility of all the methods(both dummy and concrete).*/

abstract class birds{
	
	// concrete methods.
	
	public int eyes(){return 2;}	
	private void m1(){System.out.println("private method");}
	protected void m2() {System.out.println("protected method");}
	void m3() {System.out.println("default method");}
	
	//dummy methods
	
	abstract public void m4();
	abstract protected void m5();
	abstract void m6();
	
	// abstract private void m7() --> we cannot use private with abstract. We should use either public or protected.
	
		
}

interface birds1{
	
	public void b1();
	static void b2() {System.out.println("Static method of interface 1");}
	void b3();
	// private and protected methods are not allowed to be used in interfaces.
}

interface birds2{
	public void b21();
	static void b22(){System.out.println("Static method of interface 2");}
	void b23();
	// private and protected methods are not allowed to be used in interfaces.
}

class birdsclass extends birds implements birds1,birds2{

	@Override
	public void b21() {
		
		
	}

	@Override
	public void b23() {
		
		
	}

	@Override
	public void b1() {
		
	}

	@Override
	public void b3() {
		
	}

	@Override
	public void m4() {
		
	}

	@Override
	protected void m5() {
		
	}

	@Override
	void m6() {
		
	}
	
}



public class visibiltyCheck {

	public static void main(String[] args) {
		
		
		birdsclass bobj = new birdsclass();
		bobj.eyes(); // public method of abstract class can be accessed.
		//bobj.m1(); // private methods of abstract class are not accessible.
		bobj.m2();	// protected methods of abstract class are accessible.
		bobj.m3();	// default methods of abstract class are accessible.
		bobj.m4();	//dummy public, protected, and default methods that are accessible.
		bobj.m5();
		bobj.m6();
		
		bobj.b1();// public method of interface1 are accessible
		//bobj.b2(); // static methods of interface1 are not accessible.
		bobj.b3(); //default methods of interface1 are accessible
		
		bobj.b21(); // public method of interface2 are not accessible.
		//bobj.b22(); // static methods of interface 2 are not accessible.
		bobj.b23(); // default methods of interface 2 are accessible.
	}
	

}

/***  Private methods ob abstract classes are not accessible.  
 *    Static methods of interfaces are not accessible.*/
