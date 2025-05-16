package javaExample;



class A extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Akash");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class TreadExtends {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		A t= new A();
		t.start();
		
		
		for(int i=1;i<=5;i++) {
			System.out.println("Surwase");
			Thread.sleep(1000);
		}
	}

}
