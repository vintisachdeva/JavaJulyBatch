/*
      1
     222
    33333
   4444444  
  555555555
  
 */
public class Pattern2 {

	public static void main(String[] args) {

		int temp = 1;
		
		for(int row = 1; row <= 5; row++)//row=2<=5
		{
			for(int space = row; space<= 4; space++){//space=2
				
				System.out.print(" ");
			}
				for(int column=1; column<= temp;column++)//col=1; 1<=3
				{
					System.out.print(row);//    1
											   //222
				}
				temp = temp + 2;//temp+=2; temp= 5
				System.out.println("");
			}
			
		}

	
}
