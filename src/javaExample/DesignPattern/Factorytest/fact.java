package javaExample.DesignPattern.Factorytest;

public class fact {

	public inter getnstance(String str) {
		
		if (str == "a") {
			return new a();
		}else{
			return new b();
		}
		
	}
}
