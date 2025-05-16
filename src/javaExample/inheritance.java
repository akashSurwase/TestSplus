package javaExample;



//Aggregation in Java
//If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.
//
//Consider a situation, Employee object contains many informations such as id, name, emailId etc. 
//It contains one more object named address, which contains its own informations such as city, state, country,
//zipcode etc. as given below.


class student{
	
	 int roll;
	 String student;
	
	void show() {
		System.out.println("Calling show ");
	}
}

public class inheritance  extends student{
	

	 void show() {
		roll =10;
		student="akash";
		System.out.println("roll = "+roll+" student = "+student);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritance i = new inheritance();
//		i.disp();
		i.show();
		
	}

}
