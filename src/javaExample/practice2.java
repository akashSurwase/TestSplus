package javaExample;


import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String h = "hello world";
		
		Map<Character, Long> r = h.chars().mapToObj(c->(char) c ).collect(Collectors.groupingBy(v->v,Collectors.counting()));
		
		Map<String, Long> j =Stream.of(h.split("")).map(c->c).collect(Collectors.groupingBy(i->i,Collectors.counting()));
		
		String t = Stream.of(h.split("")).collect(Collectors.collectingAndThen(Collectors.toList(), list-> {
			Collections.reverse(list);
			return list.stream();
		})).collect(Collectors.joining(""));
		
		System.out.println("Reverse String >>> "+t);
		
		
		int il = 15623;
		
		int y= Stream.of(String.valueOf(il).split("")).collect(Collectors.summingInt(Integer::parseInt));
		
		System.out.println("yyy "+y);
		
		System.out.println("rrrjj--> "+j);
		
		List<String> str = Arrays.asList("1kasj", "askjdsajk", "3ah", "asda", "ds", "4kl", "askjdsajk");
		
		List<String> rt = str.stream().filter(s-> !s.isEmpty() && Character.isDigit(s.charAt(0))).collect(Collectors.toList());
		
		System.out.println("RTTT +"+rt);
		
		List w = str.stream().map(l->l).sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
		
		List<Integer> inttt = Arrays.asList(21315, 31, 324, 8449, 5666746, 8);
		
		List<String> y1 = inttt.stream().map(o->o+"").sorted(Comparator.comparing(String::length)).collect(Collectors.collectingAndThen(Collectors.toList(), rev->{			
			Collections.reverse(rev);
			return rev.stream();
		})).collect(Collectors.toList());
		
		System.out.println("www>> "+w);

		System.out.println("y1y1>> "+y1);
		
		LocalDate gh = LocalDate.of(1995, 11, 18);
		LocalDate jk = LocalDate.now();
		
		int io = Period.between(gh, jk).getYears();
		
		System.out.println("gh >> "+io);
		
		List<String> findString = Arrays.asList("1kasj", "askjdsajk", "3ah", "asda", "ds", "4kl", "askjdsajk");
		
		List<String>find = findString.stream().filter(c-> Character.isDigit(c.charAt(0))).collect(Collectors.toList());
		
		List ji= findString.stream().map(f->f).sorted(Comparator.comparing(String::length)).collect(Collectors.collectingAndThen(Collectors.toList(), lis->{
			Collections.reverse(lis);
			return lis.stream();
			
		})).collect(Collectors.toList());
		System.out.println("Findddd ++ " + find);

		System.out.println("Ji ++ " + ji);
		
		int sum = 15623;
		
		int oo= Stream.of(String.valueOf(sum).split("")).collect(Collectors.summingInt(Integer::parseInt));
		
		System.out.println("summ++ " + oo);
		
		String count = "hello world";
		
		Map<Object, Long> coun =Stream.of(count.split("")).collect(Collectors.groupingBy(v->v,Collectors.counting()));
	
		
		System.out.println("COunntt + "+coun);
		
		List<Integer> listOfIntegers = Arrays.asList(45, 1, 56, 432315, 424, 735, 31, 89);
		
		List yu = listOfIntegers.stream().map(c->c+"").sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
		
		System.out.println("yuuu "+yu);
		
		String sentence = "This is a sample sentence";
		
		String ak =Stream.of(sentence.split("")).collect(Collectors.collectingAndThen(Collectors.toList(), f->{
			Collections.reverse(f);
			return f.stream();
		})).collect(Collectors.joining(""));
		
		System.out.println("akkk++ "+ak);
		
	}

}
