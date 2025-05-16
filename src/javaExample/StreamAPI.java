package javaExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {

		List<Integer> aslist = new ArrayList<Integer>();
		aslist.add(10);
		aslist.add(200);
		aslist.add(90);
		
		
		
		List <Integer> kk = new ArrayList<Integer>();
		
		kk =  aslist.stream().map(x->x*10).collect(Collectors.toList());
		System.out.println("KKK"+kk);
		System.out.println("Adding sysout");
		kk.stream().forEach(x ->System.out.println("kkkkkkkk"+x));
		
		
		
		List<Integer> list = new ArrayList<Integer>();		
		list = aslist.stream().filter(x -> x >90).collect(Collectors.toList());
		list.stream().forEach(System.out::println);
		list.stream().forEach(x->System.out.println("LLLLLLL== "+x));
		
		list = aslist.stream().map(x-> x*x).collect(Collectors.toList());
		list.stream().forEach(System.out::println);
		list.stream().forEach(x->System.out.println("FUN== "+x));
	}

}
