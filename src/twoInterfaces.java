/**1) Try implementing Two interfaces with same method name & signature and same return type?
2) Try implementing Two interfaces with same method name with different return type ?*/
 interface firstInterface{
	
	 public void display();
	 public int id();
	 
}

 interface secondInterface{
	 
	 public void display();
	 public String id();
 }


public class twoInterfaces implements firstInterface,secondInterface {

	public static void main(String[] args) {
		
	}

	
	public int id() {
		
		return 5;
	}

// 2_Answer: We cannot use a method with different return types and same signatures.
// 3_Answer: We can use a method with same return type and same signatures.	
	
	public void display() {
		
				
	}

}

