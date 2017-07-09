
public class BreakContinue {

	public static void main(String[] args) {
		
		for(int i = 1; i <=10;  i++){
			
			
			if(i==5)
			{
				continue;	
				//break;//loop exit
			}
		
			System.out.println(i);//1 2 5
	
		}
		System.out.println("exit from loop");
		
	}

}