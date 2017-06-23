/** 13)Apply all access specifiers to class, methods and variables.
 *  Identify by writing which ones not allowed and which ones allowed?*/
 
class firstClass{
	public int k=0;
	private int r =0;
	protected int i =0;
	int s=0;
	static int h=0;
	final int n=0;
	
	public void m1(){System.out.println("public method m1");}
	
	private void m2(){System.out.println("private method m2");}
	
	protected void m3(){System.out.println("protected method m3");}
	
	static void m4(){System.out.println(" static method m4");}
}


public class accessModifiers {

	public static void main(String[] args) {
		 firstClass obj = new firstClass();
		 obj.k=20; // public variables are accessible
		// obj.r=30; // private variables are not accessible
		 obj.i=50;  // protected variables are accessible
		 obj.s=70;  // default variables are accessible
		 obj.h=40;  //  static variables are accessible
		 //obj.n=75;  //  final variables are accessible but not modifiable
		 
		 
		 obj.m1(); // public methods are accessible
		 //obj.m2(); // private methods are not accessible.
		 obj.m3(); //protected methods are accessible.
		 obj.m4(); // static methods are accessible.
		 

	}

}
