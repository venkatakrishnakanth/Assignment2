/** 7) create a parent class ‘P’ and child classs ‘C’.
 *  P having methods variables and 2 methods. In child class override all variables
 *   and override only one method. create Class ‘C’ specific methods and variables as well.
 *   
a) create a parent reference variable and assign child class. 
Verify scope of all parent and child member through parent reference variable.*/




class Parent{
	int id =10;
	String name = "Subbarao";
	String occupation = "IT employee";
	
	void changeOccupation(){
		occupation="Business";
		System.out.println("New Occupation is Business");
	}
	
	void changeID(){
		id=50;
		System.out.println("new id is "+id);
	}
}

class Child extends Parent{
	int id=70;
	String name ="Apparao";
	String occupation ="Actor";
	float salary = 20000.50f;
	String gender = "Male";
	
	void changeOccupation(){
		occupation ="Comedian";
		System.out.println("New Occupation is Comedian");
	}
	
	void increaseSalary(){
		salary+=10000;
		System.out.println("New salary is "+ salary);
	}
}



public class parnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Child();
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.occupation);
		p.changeID();
		p.changeOccupation();
		//p.salary;    
		//p.increaseSalary();
		// The child specific methods and variables cannot be accessed.
		// Only the methods and variables of parent are accessible.
		// The method that is overrided in child class is executed instead of the method in parent class.
	}

}
