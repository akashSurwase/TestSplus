package javaExample.interview;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaConvera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		Given an input string s, reverse the order of the words.
//		 
//		Note that s may contain leading or trailing spaces or multiple spaces between two words. 
//		The returned string should only have a single space separating the words. 
//		Do not include any extra spaces.
		
//		Input: s = "the  sky is blue"
//		Output: "blue is sky the"
		
		String s= "the  sky is blue";
		
//		List h= Stream.of(s.split(" ")).map(v->v).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		String h= Stream.of(s.split(" ")).map(v->v.toString()).sorted(Comparator.reverseOrder()).collect(Collectors.joining(" "));
		
//		List h1= Stream.of(s.split(" ")).map(c->c);

		System.out.println("revereser string >> "+h);
		
		
//		Java code to print only those string whose frequency of appearence is even number of times
		String [] str1 = {"tgr","tgr","abc","xyz","abc","tgr","xyz"};
		
			
		Map<String, Long> j = Stream.of(str1).map(c->c).collect(Collectors.groupingBy(u->u, Collectors.counting()));
		
		System.out.println("elem >"+j);
		Map<Boolean, List<Entry<String, Long>>> count = j.entrySet().stream().collect(Collectors.partitioningBy(c-> c.getValue()%2==0));
		
		List getcount = count.get(true);
		
		System.out.println("Ccount>> " + getcount);
		
		
		
		
//		String s2 ="book";
		String s1 =new String("book");
		
		if(s1.equals("book")) {
			System.out.println("GGGG");
		}else {
			System.out.println("RRRR");
		}
		
		if("book".equals(s1)) {
			System.out.println("FFF");
		}else {
			System.out.println("DD");
		}		
//		What is the difference between s1.equals("book") and "book".equals(s1) , where s1 represents the object of a string?
		
	}

}
