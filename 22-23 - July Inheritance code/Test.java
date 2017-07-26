
class A{
	
	A(){
		
	}
	
	A(int value){
			
	}
}

class B extends A{
	B(){
		//super();
		System.out.println("default");
	}
}



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj  = new B(); 
	}

}
