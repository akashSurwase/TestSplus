package javaExample;


// we cannot create object of abstract class in main method
// Both non abstract method and abstract method can be use in abstract class
abstract class animal{

	 abstract void show();
	 
	 
//	 Constructor
//	 animal(){
//		 System.out.println("Call all animal");
//	 }
	
}

class animal2 extends animal{

//	animal2(){
//		super();
//	}
	
	 void show() {
		System.out.println("helloo world");
	}


}

class animal3 extends animal{
	 void show() {
		System.out.println("helloo world 2");
	}	 

}

public class abstractClass {

	public static void main(String[] args) {
		
//		we can create reference of class animal but not able to 
//		create the object the class in abstract method.
		animal a = new  animal2();
		animal a1 = new  animal3();
		a.show();
		a1.show();

	}

}
