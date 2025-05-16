package javaExample;

public class PolyMethodOverloading {
	
	static void add() {
		System.out.println("zero orgument");
	}
	
	void add(int a, int b) {
		int c;
		c= a+b;
		System.out.println("Addition "+c);
	}
	
	void add(int x, double y) {
		double c;
		c= x+y;
		System.out.println("double "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PolyMethodOverloading poly = new PolyMethodOverloading();
		PolyMethodOverloading.add(); //if you add static keyword to the method then no need to create object of that class
		poly.add(10, 70);
		poly.add(45, 90.89);
	}

}
