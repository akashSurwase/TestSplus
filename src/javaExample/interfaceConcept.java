package javaExample;

interface rule{
	
//	int amt =5; //public, static, final
//	Cannot assigned different value to variable it is fixed or constant
	void call();
	void message();

}

class simOne implements rule{
	
	 public void call(){
		System.out.println("calling....");
	}
	
	 public void message() {
		System.out.println("message....");
	}
	
}

public class interfaceConcept {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rule r = new simOne();
		r.call();
		r.message();
	}

}
