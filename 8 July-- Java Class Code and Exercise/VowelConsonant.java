import java.util.Scanner;


public class VowelConsonant {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter vowel or consonant");
		
		char value = scanner.next().charAt(0);
		
		switch(value){
		
		case 'a':
		case 'A':
		case 'e':
		case 'E':	
		case 'i':
		case 'I':	
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("Vowel");
		break;
		
		default:
			System.out.println("consonant");
		
		}

	}

}
