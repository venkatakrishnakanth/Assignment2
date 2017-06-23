/**9) Come up with an awesome your Own object and build interfaces and abstract classes
 *  around.
10) Can we override a construtors?
11) Cam we overload a construtor?
12)Is java follow pass-by-value or pass-by-reference ?*/




abstract class smartphone{
	
	public void display(){
		System.out.println("Every smartphone has minimum 1080p display");
	}
	
	public void fingerprint(){
		System.out.println("Now-a-days fingerprint sensor is found in every smartphone");
	}
}

interface features{
	
	public void allGlassDesign();
	public void wirelessCharging();
	public void processorChip();
}



class iphone extends smartphone implements features{
	
	public void allGlassDesign(){
		System.out.println("No iphone does not have all glass design right now");
	}
	public void wirelessCharging(){
		System.out.println("Wireless charging is not available. It comes only with all glass design");
	}
	
	public void processorChip(){
		System.out.println("iphone7- Apple's A10 processor chip");
	}
	
	
	
}

class samsung extends smartphone implements features{
	
	private int displaySize=0;
	
	samsung(){}
	
	samsung(int displaySize){
		this.displaySize = displaySize;
	}
	//11_Answer: Yes constructors can be overloaded.
	
	public void allGlassDesign(){
		System.out.println("Yes samsungS8 have all glass design ");
	}
	public void wirelessCharging(){
		System.out.println("Wireless charging is available with samsung galaxy S8");
	}
	
	public void processorChip(){
		System.out.println("SamsungS8--Snapdragon 835 chip");
	}
	public void display(){
		System.out.println("SamsungS8-- Amoled 2K display with true colors.");
	}
}





public class MyOwnClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		iphone iphone7 = new iphone();
		samsung S8 = new samsung();
		
		System.out.println("Apple iphone7 features");
		iphone7.display();
		iphone7.fingerprint();
		iphone7.allGlassDesign();
		iphone7.wirelessCharging();
		iphone7.processorChip();
		
		System.out.println("\nSamsung Galaxy S8 features");
		S8.display();
		S8.fingerprint();
		S8.allGlassDesign();
		S8.wirelessCharging();
		S8.processorChip();

	}

}
//10_Answer: No, constructors cannot be overrided, because they cannot be inherited.
// 11_Answer: Yes, constructors can be overloaded.
// 12_Answer: Java follows pass by value. it pass the values as arguments to the methods.
