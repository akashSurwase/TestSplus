package javaExample.Interfacedefault;

public class fish implements animal {

	@Override
	public void specialCapabilities() {
		// TODO Auto-generated method stub
		System.out.println("fish");
	}
	
	@Override
	public void legs() {
		System.out.println("fish has no legs");
	}

}
