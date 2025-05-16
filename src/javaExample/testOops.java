package javaExample;


class a1{
	
	int p;
	String s;
	
	void show() {
		System.out.println("calling show method");
	}
}

public class testOops extends a1{
	
	void display() {
		p=10;
		s ="akash";
		System.out.println("calling display method " + p +"  " + s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testOops j = new testOops();
		j.display();
		j.show();

	}

}
