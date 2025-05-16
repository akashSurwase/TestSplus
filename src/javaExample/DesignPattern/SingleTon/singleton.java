package javaExample.DesignPattern.SingleTon;


class singleObject {
	static singleObject s= new singleObject();	
	
	private  singleObject() {
		
	}	
	static singleObject getInstance() {
		return s;
	}
}
public class singleton {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		singleObject s = singleObject.getInstance();
		
//		Immutable Example
		
		String s1= "code";
		System.out.println(s1.hashCode());
		
//		for code new SCP(String constat pool) is created 
		
		s1=s1+"decode";
		
//	for above new scp is created plus added decode to the SCP in heap memory

		System.out.println(s1.hashCode());

	}

}
