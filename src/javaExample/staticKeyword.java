package javaExample;


//static keyword in Java is used for memory management mainly. 
//We can apply static keyword with variables, methods, blocks

//Why is the Java main method static?
//Ans) It is because the object is not required to call a static method. If it were a non-static method, 
//JVM creates an object first then call main() method that will lead the problem of extra memory allocation.


//This Keyword
//
//The this keyword can be used to refer current class instance variable. 
//If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.


class staticEg{
	
	int i;
	String college;
	static String name ="sinhgad";
	
	static void change() {
		name ="SCOE";
	}
	
	staticEg(int k, String c ){
		
		i=k;
		college=c;
		
	}
	
	void display() {
		System.out.println("ID : "+i +" College "+ college+ " "+" name :"+name);
	}
}


public class staticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticEg.change();
		staticEg s = new staticEg(100, "scop"); 
		s.display();
	}

}
