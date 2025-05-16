package javaExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

abstract class animal1 {
	animal1(){
		System.out.println("All animal...!");
	}
	public abstract void sound();
}

class dog extends animal1{
	
	public void sound() {
		System.out.println("Dog is barking");
	}
}
class lion extends animal1{
	lion(){
		super();
	}
	public void sound() {
		System.out.println("lion is roar");
	}
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog d = new dog();
		lion l = new lion();
		d.sound();
		l.sound();
		
		List<Integer> kk = new ArrayList<Integer>();
		kk.add(90);
		kk.add(100);
		kk.add(23);
		kk.add(54);
		
		List <Integer> kl = kk.stream().filter(x-> x>54).collect(Collectors.toList());
		System.out.println("LLLLL" +kl);
		
		kl.stream().forEach(x -> System.out.println("KKK"+x));
		
	}

}
