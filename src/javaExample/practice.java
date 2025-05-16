package javaExample;

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


class EmptyClass{
	
}
  

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String h = "hello world";
		Map<Character, Long> lk = h.chars().filter(c -> !Character.isWhitespace(c)).mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("KKKKK " + lk);

		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		Set<String> gh = new HashSet<>();
		List h1 = listOfStrings.stream().filter(c -> !gh.add(c)).collect(Collectors.toList());
		System.out.println("H1 >>> " + h1);

		String join = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println("String >> " + join);

		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		list.stream().sorted((a, b) -> b.compareTo(a)).forEach(c -> System.out.println(c));

		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 735, 31, 89);

		Integer j = listOfIntegers.stream().min(Integer::compareTo).get();

		listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3)
				.forEach(c -> System.out.println("DDDDD > " + c));

		System.out.println("KKK " + j);

		String s1 = "RaceCar";
		String s2 = "Car Race";

		s1 = Stream.of(s1.split("")).map(c -> c.toUpperCase()).sorted().collect(Collectors.joining());
		s2 = Stream.of(s2.split("")).map(c -> c.toUpperCase()).sorted().collect(Collectors.joining());

		if (s1.equals(s2)) {
			System.out.println("analog");
		} else {
			System.out.println("not analog");
		}

		int i = 156231;

		List<String> f = Stream.of(String.valueOf(i).split("")).collect(Collectors.toList());

		System.out.println("KKKKK + " + f);

		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

		List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34, 56);

		List o = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());

		System.out.println("OOOOOOOOOOOOO + " + o);

		List<String> listStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

		List<String> ak = listStrings.stream().sorted(Comparator.comparing(String::length))
				.collect(Collectors.toList());
		System.out.println("AKKKKKKKK " + ak);

		List<Integer> inttt = Arrays.asList(21315, 31, 324, 8449, 5666746, 8);

		List<String> akk = inttt.stream().map(c -> c.toString()).sorted(Comparator.comparing(String::length))
				.collect(Collectors.toList());

		System.out.println("List  >>>" + akk);
		
		
		List<String> str = Arrays.asList("1kasj", "askjdsajk", "3ah", "asda", "ds", "4kl", "askjdsajk");
		
		String sd = "RaceCar";
		String ghh= Stream.of(sd.split("")).map(c->c.toUpperCase()).sorted().collect(Collectors.joining());
		System.out.println("ghhhh"+ ghh);
		
		int ik = 156231;
		
		
//		String.valueOf(ik).chars().map(Character::getNumericValue).sum();
		System.out.println("KL + "+String.valueOf(ik).chars().map(Character::getNumericValue).sum());
		
		Stream.of(String.valueOf(ik).split("")).map(c-> Integer.parseInt(c.toString())).sorted().forEach(k->System.out.println("SORTED>>> "+k));
		
		String ol = "ROTATOR";
		
		boolean k =IntStream.range(0, ol.length()/2).noneMatch(c->ol.charAt(c) != ol.length()-c-1);
		
		int add = 156231;
		
			String fh = Stream.of(sd.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
			
			System.out.println("fhhh "+fh);
			
			String jk = "Hello world";
			
			Optional<Entry<Character, Long>> repeted = jk.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			.entrySet().stream().collect(Collectors.maxBy(Comparator.comparing(Entry::getValue)));
			
			System.out.println("repeted>> "+repeted);
			
			
			String sentence = "This is a sample sentence";
			
			String s = Stream.of(sentence.split(" ")).collect(Collectors.collectingAndThen(Collectors.toList(), a->{
				Collections.reverse(a);
				return a.stream();
			})).collect(Collectors.joining(" "));
			
			System.out.println("s>> "+s);
			
			
			int il = 15623;
			
			int y = Stream.of(String.valueOf(il).split("")).collect(Collectors.summingInt(Integer::parseInt));

			System.out.println(" yyy "+y);
			
			String hh = "AKash Surwase";
			
			Map<Object, Long> hg = hh.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(v->v, Collectors.counting()));
			
			System.out.println("hg++ "+hg);
			
			String sen = "This is a sample sentence";
			
			String finals = Stream.of(sen.split(" ")).map(c->c).collect(Collectors.collectingAndThen(Collectors.toList(), b->{
				Collections.reverse(b);
				return b.stream();
				})).collect(Collectors.joining(" "));
			
			System.out.println("finals>>> "+finals);
			

	}
}
