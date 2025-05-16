package javaExample;


//constructor is special type of method having same name as class name
//main purpose is to initialize the object
//constructor automatically called at the time of object creation

class cons {
	int cons; String name;
	cons(){
		cons=0; name=null;
	}
	void show() {
		System.out.println(cons + " " + name);
	}
}

public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cons ref = new cons();
		ref.show();
	}

}
