package javaExample;


//CPU to execute multiple threads independently at the same time but share the process resources simultaneously. 
//Its main purpose is to provide simultaneous execution of multiple threads to utilize the CPU time as much as possible


class AB implements Runnable{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("My child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


public class ThreadRunnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		AB t = new AB();		
		Thread t1 = new Thread(t);
		t1.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}

	}

}
