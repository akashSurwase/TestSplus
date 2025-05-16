package javaExample.DesignPattern.Factory;

public class mainFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OsFactory fact = new OsFactory();
		
		OSInterface o = fact.getInstance("Android");
		o.spec();

	}

}
