/*
      1
     12
    123
   1234  
  12345 
 
 */




public class Pattern1 {

	public static void main(String[] args) {

		for(int row = 1; row<=5; row++)
		{
			for(int space = row; space<= 4; space++){//space, row =2
				
				System.out.print(" ");
			}
				for(int column=1; column<=row;column++)
				{
					System.out.print(column);
				}
				System.out.println("");
			}
			
		}
	

}
