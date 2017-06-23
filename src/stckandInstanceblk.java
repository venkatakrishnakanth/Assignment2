/** 3) Try adding a static block and instance block inside interface ?
 * 
 *  4) Add a static block and instance block inside abstract class and identify 
 *  the sequence of execution 
 *  
 *   5)Create a class static block, instance block and default constructor.
 *    create object for the same class and let me know the sequence of execution ?
 *  */




interface hellointerface {
	
	/*static {
		System.out.println("Inside a static block");
		}*/
	
	//{System.out.println("Inside a instance block");}
	
	/*3_Answer: We cannot define blocks in an interface whether the block may be static or instance.*/
}


abstract class helloclass{
	
	{System.out.println("Inside a instance block");}
	static {
		System.out.println("Inside a static block");}
	
	
} /*4_Answer: The static block will be executed first and later the instance block will be executed.*/


class oneclass{
	//static block
	static {System.out.println("Inside a static block of oneclass");}
	
	//default constructor
		oneclass(){
			System.out.println("Inside default constructor of one class");
		}
	
	//instance block
	{System.out.println("Inside an instance block of oneclass");}
	
/* 5_Answer: The static block will be executed first, next the instance block and later the constructor will be executed.*/	
	
}



public class stckandInstanceblk extends helloclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stckandInstanceblk obj = new stckandInstanceblk();
		oneclass oneobj = new oneclass();

	}

}

/*3_Answer: We cannot define blocks in an interface whether the block may be static or instance.*/
/*4_Answer: The static block will be executed first and later the instance block will be executed.*/
/* 5_Answer: The static block will be executed first, next the instance block and later the constructor will be executed.*/	
