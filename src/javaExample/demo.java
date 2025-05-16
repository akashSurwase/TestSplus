package javaExample;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

interface abc{
	// abstract method
	void call();

	
	 // default method   
	default void message() {
		System.out.println("message...");
	}
	
	// static method    
	static void sayLouder(String msg){    
        System.out.println(msg);    
    }   	
}

class xyz implements abc{
	public void call() {
		System.out.println("calling...");
	} 	
}

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		refernce of interace <--&&---> object of class
		abc x = new xyz();
		x.call();
		x.message();
		abc.sayLouder("static method calling");
		
		
		List<Integer> values = Arrays.asList(4,5,3,1,8,9,20);
//		for (Integer integer : values) {
//			System.out.println("values"+integer);
//		}
		values.stream().forEach(i->System.out.println(i*2));
		System.out.println("===============================");
		Random random = new Random();

		random.ints().limit(10).forEach(System.out::println);
		
		
	}

}
