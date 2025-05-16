package javaExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jk = "Hello world";
		
		Map<Character, Long> hj = jk.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(v->v, Collectors.counting()));
		List<Entry<Character, Long>> k = hj.entrySet().stream().filter(p->p.getValue()>1).collect(Collectors.toList());
		
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		
		List<String> gh = list.stream().map(c->c+"").filter(p->p.startsWith("1")).collect(Collectors.toList());
		
		System.out.println("GH : " +gh);
		
		List<Integer> myList = Arrays.asList(1,2,3);
		
		int sum = myList.stream().collect(Collectors.summingInt(c->c));
		System.out.println("SUMMMMM + "+sum);
		Set<Integer> set = new HashSet();
		List<Integer> HG = myList.stream().filter(b-> !set.add(b)).collect(Collectors.toList());
		
		Integer f =myList.stream().max(Integer::compare).get();
		
		List<Integer> j =myList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("HG++ " + "ffff : "+j);
		
		List<Notes> noteLst = new ArrayList<>();
	   noteLst.add(new Notes(23,"asd",22));
	   
	   List<Notes> hjg = noteLst.stream().sorted((a,b)->Integer.compare(b.getNum(), a.getNum())).collect(Collectors.toList());
	   
	   List<Notes> dd = noteLst.stream().filter(c->c.getNote().startsWith("k")).collect(Collectors.toList());
	   
	   System.out.println("dd>> "+dd);
	   System.out.println("notes>> "+hjg);
//	   hjg.forEach(c->System.out.println("cc> "+c));
	   
	   List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
	   names.stream().collect(Collectors.groupingBy(jf->j, Collectors.counting()));
	   
	   String str = "ROTATOR";
	   
	   boolean s =IntStream.range(0, str.length()/2).noneMatch(s1->str.charAt(s1) != str.length()-s1-1);
	   

	}

}
