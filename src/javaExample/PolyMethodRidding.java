package javaExample;


class shape{

	 void draw() {
		System.out.println("cannot say shape type");
	}
}

class square extends shape{
	
	
//	@Override
	 void draw() {
//		super.draw();
		System.out.println("sqaure shape");
	}
}

//whenever we writing the method in super and sub classes in such way that the method name and parameter must be same is called
//We cannot perform overriding without inheritance

public class PolyMethodRidding {
	public static void main(String[] args) {
		
		shape s = new square();		
		s.draw();
	}}

//When type of the object is determine at the compile time is known as late binding
//If there is any private, final or static method in a class, there is static binding.
//
//When type of the object is determine at the run time is known as dynamic binding

//Usage of Java super Keyword
//super can be used to refer immediate parent class instance variable.
//super can be used to invoke immediate parent class method.
//super() can be used to invoke immediate parent class constructor.


//Instance Intializer block
//Instance Initializer block is used to initialize the instance data member. 
//It run each time when object of the class is created.


//Covariant Return Type
//- where we can change the return type of overriden method.


//class AClass{    
//	AClass get()
//	{
//		return this;
//		}    
//	void message1(){
//		System.out.println("welcome to covariant return type111111111");
//		}    
//}    
//    
//class PolyMethodRidding extends AClass{    
//	
//@Override  
//PolyMethodRidding get(){
//	return new PolyMethodRidding();
//	}    
//
//void message(){
//	System.out.println("welcome to covariant return type");
//	}    
//
//public static void main(String args[]){    
//new PolyMethodRidding().get().message();
//new AClass().get().message1();
//}    
//}    




