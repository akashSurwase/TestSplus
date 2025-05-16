package javaExample.DesignPattern.Factorytest;

public class mainclas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fact f = new fact();
		inter h = f.getnstance("k");
		h.spec();
	}

}
