package javaExample.DesignPattern.Factory;

public class OsFactory {
	
	public OSInterface getInstance(String str) {
		
		if(str.equals("IOS")) {
			return new IOS();
		}else if(str.equals("Android")) {
			return new android();
		}else {
			return new windows();
		}
		
	}

}
