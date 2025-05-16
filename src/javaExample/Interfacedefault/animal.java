package javaExample.Interfacedefault;

public interface animal {
	
	public void specialCapabilities();

	default public void legs() {
		System.out.println("animal have 4 legs");
	};
}
