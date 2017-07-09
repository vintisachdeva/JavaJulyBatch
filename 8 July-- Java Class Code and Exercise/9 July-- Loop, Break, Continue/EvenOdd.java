
public class EvenOdd {

	//non-static
	//int evenCounter = 0, oddCounter = 0, value;
	
	
	
	public static void main(String[] args) {

		//inside method, inside loop, inside constructor
		//local variable
		int evenCounter = 0, oddCounter = 0, value;
	
		//EvenOdd obj = new EvenOdd();
		
		
		for(value = 1; value<=100; value++){
			
			if(value % 2 == 0){
				
				System.out.println("Even = " + value);
				evenCounter++;
				
			} else{
				System.out.println("Odd = " + value);
				oddCounter++;
			}
			
		}
		System.out.println("Total Even=" +evenCounter);
		System.out.println("Total Odd=" +oddCounter);
	}

}
