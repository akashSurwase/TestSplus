package javaExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jk = "Hello worlddd";

		Map<Character, Long> hj = jk.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(y -> y, Collectors.counting()));
		
		System.out.println("hj>> "+hj);

		Optional<Entry<Character, Long>> hkk = hj.entrySet().stream()
				.collect(Collectors.maxBy(Comparator.comparingLong(Entry::getValue)));

		hkk.ifPresent(f -> System.out.println(f.getKey() + "  max" + f.getValue()));

		List<Integer> op = Arrays.asList(32, 4, 5, 122, 2, 1, 4, 5, 5);

		Map<Object, Long> ui1 = op.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		Optional<Entry<Integer, Long>> ui = op.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()))
				.entrySet().stream().collect(Collectors.maxBy(Comparator.comparingLong(Entry::getValue)));

		Optional<Entry<Object, Long>> hjh = ui1.entrySet().stream()
				.collect(Collectors.maxBy(Comparator.comparingLong(Entry::getValue)));
		System.out.println(hjh);
		ui.ifPresent(f -> System.out.println(f.getKey() + " UI   " + f.getValue()));
		hjh.ifPresent(f -> System.out.println(f.getKey() + "   " + f.getValue()));

		List<Integer> arr1 = new ArrayList<>();
		arr1.add(2);
		arr1.add(5);
		arr1.add(7);
		arr1.add(7);

		List<Integer> arr2 = new ArrayList<>();
		arr2.add(1);
		arr2.add(3);
		arr2.add(5);
		arr2.add(2);

		List<Integer> finalArray = Stream.concat(arr1.stream(), arr2.stream()).collect(Collectors.toList());
		System.out.println(finalArray);

		Integer[] arr3 = { 1, 2, 3, 4, 5 };
		Integer[] arr4 = { 7, 6, 3, 4, 5 };

		List<Integer> hjy = Stream.concat(Arrays.stream(arr3), Arrays.stream(arr4)).distinct()
				.collect(Collectors.toList());

		System.out.println("concat >> " + hjy);

		List<String> str = Arrays.asList("1kasj", "askjdsajk", "3ah", "asda", "ds", "4kl", "askjdsajk");

		List<Entry<String, Long>> gh = str.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()))
				.entrySet().stream().filter(f -> f.getValue() > 1).collect(Collectors.toList());

		System.out.println("Syyyy " + gh);

		List<List<String>> listOfLists = Arrays.asList(Arrays.asList("Geek", "For"), Arrays.asList("Geetika", "KLK"));

		System.out.println("listOfLists >> " + listOfLists);

		List<String> jkl = listOfLists.stream().flatMap(i -> i.stream()).filter(y -> y.startsWith("G"))
				.collect(Collectors.toList());

		jkl.forEach(w -> System.out.println("Filters value > " + w));

		Integer[] a3 = { 1, 2, 3, 4, 5 };
		Integer[] a4 = { 7, 6, 3, 4, 5 };

		Map<Boolean, List<Integer>> even = Stream.concat(Arrays.stream(a3), Arrays.stream(a4))
				.collect(Collectors.partitioningBy(c -> c % 2 == 0));

		List<Integer> hh = even.get(true);
		hh.forEach(e -> System.out.println("even number : " + e));

		String jjk = "Hello worldl";

		Map<Character, Long> hhh = jjk.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		List<Entry<Character, Long>> ll = hhh.entrySet().stream().filter(u -> u.getValue() > 1)
				.collect(Collectors.toList());

		ll.forEach(gg -> System.out.println("HHHHH : " + gg));

		List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

		Map<Object, Long> jkk = list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));

		jkk.entrySet().forEach(k -> System.out.println("fruite : " + k));

		IntStream.range(1, 10).filter(c -> c % 2 == 0).forEach(h -> System.out.println("odd number : " + h));

		List<Integer> b1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> b2 = Arrays.asList(7, 6, 8, 4, 5);

		Integer h = b2.stream().max(Collections.reverseOrder()).get();
		
		System.out.println("MINNN "+h);

		List<Integer> f = Stream.concat(b1.stream(), b2.stream()).sorted((a, b) -> b.compareTo(a))
				.collect(Collectors.toList());

		System.out.println("MAX number : " + f);

		Integer g = 15;
		String opp = "12345";
		List<String> b12 = Arrays.asList("12345", "1545", "235", "4355", "542");

		Double hjg = b12.stream().map(c -> Integer.parseInt(c)).collect(Collectors.averagingInt(v -> v));
		System.out.println("hjgggg >> " + hjg);

		opp.chars().map(Character::getNumericValue).average();

		int h1 = String.valueOf(g).chars().map(Character::getNumericValue).sum();
		System.out.println("h1 > " + h1);

		Integer g1 = Stream.of(String.valueOf(g).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println("GGGGG + " + g1);

		String ak = "HELLO WORLD";

		String s1 = "RaceCar";
		String s2 = "CarRace";

		s1 = Stream.of(s1.split("")).map(e -> e.toUpperCase()).sorted().collect(Collectors.joining());

		s2 = Stream.of(s2.split("")).map(e -> e.toUpperCase()).sorted().collect(Collectors.joining());

		System.out.println("SSSS + " + s1);
		System.out.println("SSSS + " + s2);

		if (s1.equals(s2)) {
			System.out.println("Two strings are anagrams");
		} else {
			System.out.println("Two strings are not anagrams");
		}

		int i = 15623;

		Integer sum = String.valueOf(i).chars().map(Character::getNumericValue).sum();

		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		Integer value = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("max>> " + value);

		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

		List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34, 56);

		list1.stream().filter(list2::contains).forEach(s -> System.out.println("SORTED >> " + s));

		List<Entry<Integer, Long>> io = Stream.concat(list1.stream(), list2.stream())
				.collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet().stream()
				.filter(c -> c.getValue() > 1).collect(Collectors.toList());

		System.out.println("LLLL > " + io);

		String str1 = "Java Concept Of The Day";
		String str2 = "avaJ tpecnoC fO ehT yaD";

		str1 = Arrays.stream(str1.split("")).map(c -> c.toUpperCase()).sorted().collect(Collectors.joining());
		str2 = Arrays.stream(str2.split("")).map(c -> c.toUpperCase()).sorted().collect(Collectors.joining());

		String ga = Arrays.stream(str1.split(" ")).map(c -> new StringBuffer(c).reverse())
				.collect(Collectors.joining(" "));

		System.out.println("KKKKKK " + ga);

		IntStream.range(1, 10).filter(c -> c % 2 == 0).forEach(c -> System.out.println(c));

		Integer[] array = { 5, 1, 7, 3, 9 };

		List<Integer> f1 = Arrays.asList(array);

		Collections.reverse(f1);
		System.out.println("F1111 >> " + f1);

		List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book",
				"Pencil");

		List<Entry<String, Long>> qh = listOfStrings.stream()
				.collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet().stream()
				.filter(c -> c.getValue() > 1).collect(Collectors.toList());
		System.out.println("ddddddddd : " + qh);

	}

}
