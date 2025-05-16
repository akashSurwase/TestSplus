package testEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class testinfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> rt = Arrays.asList(2,4,5,8,100,9,6);
		
//		Map <Integer, Long> st= rt.stream().
		Map<Boolean,List<Integer>> patitionBy = rt.stream().collect(Collectors.partitioningBy(c->c%2==0));
		
		List <Integer> odd = patitionBy.get(true);
		List <Integer> even = patitionBy.get(false);

		System.out.println("odd > "+odd);
		System.out.println("even > "+even);
		System.out.println("=================================================================");
		List <Integer> kl = Arrays.asList(2,4,5,8,100,9,6);

		List<Integer> ko = kl.stream().distinct().collect(Collectors.toList());
		
		ko.forEach(t -> System.out.println("duplicate element"+t));
		
		System.out.println("=================================================================");
		System.out.println("git learn using intellij idea and pushing latest data to latest branch");
		
		String k ="hello world!";

		Map<Character, Long> as = k.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()));
		
		as.forEach((a,b)->System.out.println(a+ " "+b ));
		
		System.out.println("=================================================================");
		
		List<String> fruit = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		Map<String, Long> f1= fruit.stream().collect(Collectors.groupingBy(c->c, Collectors.counting()));
		
		f1.forEach((a,b)->System.out.println(a+" "+b));
		
		System.out.println("=================================================================");
		
		List<Double> dec = Arrays.asList(3.23,4.56,7.87,7.67,1.2);
		
		List<Double> d1 = dec.stream().sorted((a,b)->b.compareTo(a)).distinct().collect(Collectors.toList());
		
		d1.forEach(g->System.out.println("decimal rever order "+g));
		
		System.out.println("=================================================================");
		List<Integer> fg = Arrays.asList(3,4,7,5,1);
		
		List<Integer> jk = fg.stream().sorted().limit(3).distinct().collect(Collectors.toList());
		
		jk.forEach(k1->System.out.println("minimum "+k1));
		
		System.out.println("=================================================================");
		
		Integer[] arr1 = {3,5,2};
		Integer[] arr2 = {1,4,6};		
		Integer[] mergerArray = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted()
									.distinct().toArray(Integer[]::new);
		System.out.println("Merge arrat" +Arrays.toString(mergerArray));
		
		System.out.println("=================================================================");
		
		Integer [] ad = {2,3,15,14,6};		
		Arrays.sort(ad, Collections.reverseOrder());		
		System.out.println("second top element>> "+ ad[1]);
				
		System.out.println("=================================================================");		
	       
        Integer[] arr3 = {1,2,3,4,5};
        Integer[] arr4 = {7,8,3,4};
        
        Set<Integer> set1 = Arrays.stream(arr3).collect(Collectors.toSet());
        
        List<Integer> fd = Arrays.stream(arr4).filter(set1::contains).collect(Collectors.toList());
        System.out.println("cppmon element in arrays " +fd);
        
        
		
		System.out.println("=================================================================");
		
		String op= "Hello world!";
		
		Map<Character,Long> lo= op.chars().mapToObj(c-> (char) c)
											.collect(Collectors.groupingBy(c->c, Collectors.counting()));
		
//		lo.forEach((a,b));
		System.out.println("looo " +lo);
		
		Map ui = lo.entrySet().stream().filter(e-> e.getValue() > 1).collect(Collectors.groupingBy(e->e, Collectors.counting()));
		
		System.out.println("UUUIII "+ ui);
		
		
		System.out.println("=================================================================");
		
		
		 List<Integer> jlk = new ArrayList<>();
	        jlk.add(2);
	        jlk.add(5);
	        jlk.add(7);
	        jlk.add(7);
	        
	        
	     List<Integer> jlk1 = new ArrayList<>();
	        jlk1.add(1);
	        jlk1.add(3);
	        jlk1.add(5);
	        jlk1.add(2);
	        
	        Set<Integer> ioo =jlk1.stream().collect(Collectors.toSet());
	        
	        if(jlk1.size() == ioo.size())
	        {
	        	System.out.println("true");
	        }else {
	        	System.out.println("false");
	        }
	        List<Integer> po = Stream.concat(jlk.stream(),jlk1.stream()).distinct().collect(Collectors.toList());
	        
	        
	        
	        Map <Boolean ,List<Integer>> kls= jlk.stream().collect(Collectors.partitioningBy(c->c%2==0));
		
	        List <Integer> oddd =kls.get(false);
	        List <Integer> evenn =kls.get(true);
	        
	        List<Integer> klo = Stream.concat(oddd.stream(), evenn.stream()).distinct().collect(Collectors.toList());
	        
	        System.out.println("OOOOOOO > "+klo);
	        kls.forEach((a,b) ->System.out.println(b));
	        
	        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
	        
	        myList.size();
	        List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,32);
	        myList1.stream().map(s->s+ "").filter(s->s.startsWith("1")).forEach(System.out::println );
	        
	        long c = myList.stream().count();
	        System.out.println("c : " +c);

	        Integer my = myList.stream().max(Integer::compare).get();
	        System.out.println("Max Number:: "+ my);
	        
	        String input = "Java articles are Awesome";
	        
	        Map<Character , Long> ip = input.chars().mapToObj(q-> (char) c).collect(Collectors.groupingBy(q1->q1,Collectors.counting()));
	        
	        Map jp = ip.entrySet().stream().filter(e->e.getValue() == 1).collect(Collectors.groupingBy(e1->e1, Collectors.counting()));
	        
	        jp.forEach((a,b)-> System.out.println(a+ " "));
	        
	        
	        
	        List<String> list1 = Arrays.asList("Java", "8");
	        List<String> list2 = Arrays.asList("explained", "through", "programs");
	 
	        Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());
	         
	        // Concatenated the list1 and list2 by converting them into Stream
	        concatStream.forEach(str -> System.out.print(str + " "));
	        
	        
	        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
	        
	        integerList.stream().map(i->i*i*i).filter(i->i>50).forEach(System.out::println);
	        

	}

}
