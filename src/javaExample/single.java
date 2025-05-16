package javaExample;

class singleObj{
	static singleObj ss = new singleObj();
	
	private singleObj() {
		
	}
	
	public static singleObj getInstance2() {
		return ss;
	}
}

public class single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleObj g = singleObj.getInstance2();
	}

}
