package javaExample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> fruitBasket = new HashMap<>();
        fruitBasket.put("Apple", "one");
        fruitBasket.put("Orange", "two");
        fruitBasket.put("Banana", "three");
 
        System.out.println("Initial Fruit Basket: " + fruitBasket);
        
        fruitBasket.entrySet().stream()
        .filter(entry -> entry.getValue().startsWith("o"))
        .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
        
        List<String> kl = new ArrayList<>();
        kl.add("asjas");
        kl.add("asjas");
        kl.add("ksjas");
        kl.add("akkksjas");
        
        kl.stream().filter(e-> e.toString().startsWith("a")).forEach(System.out::println);
        
        System.out.println("==================== Reverse String =======================");
       
        String ds = "Hello World!", str="";        
        char ch;
        
//        char [] sy =ds.toCharArray();
//        System.out.println("character array : "+Arrays.toString(sy));
        
        for (int i =0; i<ds.length();i++) {        	
        	ch = ds.charAt(i);
        	str = ch+str;        	
        }
        
        System.out.println("using Loop "+ str);        
        
        StringBuilder input1 = new StringBuilder();
        input1.append(ds);        
        input1.reverse();
        System.out.println("Stringbuilder :" +input1);

        StringBuffer sbr = new StringBuffer();
        sbr.append(ds);
        sbr.reverse();
        System.out.println("Stringbuffer :" +sbr);
        
        Scanner scanner = new Scanner(System.in);
        String Str1 = scanner.nextLine();
        
        StringBuilder input12 = new StringBuilder(Str1);
        input12.reverse();
        System.out.println("Taking inout from code :" +input12);
        
        
        System.out.println("===========================================");
        System.out.println("===================DUplicate element in array ======================");
        
        int[] arr = {8,9,2,5,7,7,8,2}; 
//        int temp = 0;        
//        List<Integer> jk = new ArrayList<>();
        int j;
        for (int i=0;i<arr.length;i++) {
        	for (j=1+i; j<arr.length;j++) {
        		if(arr[i]==arr[j]) {
        			System.out.println("duplicate element "+arr[j]);        			
        		}
        	}        	
        }       
        
//        shortcut              
        Arrays.sort(arr);
        for (int num : arr) {
            System.out.println(num + " ");
        }
//      shortcut        
        

        
//        reverse sorder
        System.out.println("==============================================");
        Integer array[] = {9,5,6,3,10,1};
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("arrays >>> "+Arrays.toString(array));

        System.out.println("====================remove duplicate element using streams==========================");
        
        List<Integer> jlk = new ArrayList<>();
        jlk.add(2);
        jlk.add(5);
        jlk.add(7);
        jlk.add(7);
        
        List<Integer> distinctNumbers = jlk.stream().distinct().collect(Collectors.toList());
        
        System.out.println("remove duplicate element : "+distinctNumbers);
      
        System.out.println("=======================partition by==============================");
        
        Map<Boolean, List<Integer>> partionBy = jlk.stream().collect(Collectors.partitioningBy(h->h%2==0));
        
        List<Integer> odd = partionBy.get(true);
        List<Integer> even = partionBy.get(false);
        
        System.out.println("odd : "+odd);
        System.out.println("Even : " +even);
        
        System.out.println("=======================Occurance of each Character==============================");
        
        String h = "AKash Surwase";
        
        Map<Character, Long> frquency = h.chars().mapToObj(c->(char) c)
        										.collect(Collectors.groupingBy(c->c, Collectors.counting()));
        
        frquency.forEach((chr, fr)->System.out.println(chr+ " "+fr));
        
        System.out.println("=======================Occurance of each element (string)==============================");
        
        List<String> list =Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        
        Map<String,Long> freuqncyElement = list.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));
        
        freuqncyElement.forEach((o,p)->System.out.println(o + " "+ p));
        
        System.out.println("=======================Occurance of each element (Integer)==============================");
        
        List<Integer> listInt =Arrays.asList(9,5,9,3,6,3,10,1);
        Map<Integer,Long> freuqncyElement1 = listInt.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));        
        freuqncyElement1.forEach((o,p)->System.out.println(o + " "+ p));
        

        System.out.println("=======================Reverse and SOrted==============================");
        List <Integer> lis = listInt.stream().sorted().collect(Collectors.toList());        
        List <Integer> lis2 = listInt.stream().sorted((a,b)-> b.compareTo(a)).collect(Collectors.toList());

        lis2.forEach(lis23 -> System.out.println("Reverse " +lis23));
        System.out.println("=========================================");
        lis.forEach(lis1 -> System.out.println("Sortedd " +lis1));
        
        System.out.println("=======================Merge two sorted element==============================");
        
        Integer arr1[] = {3,5,6};
        Integer arr2 []= {1,4,2,6};
        
        Integer mergedAndSortedArray[] = Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().distinct().toArray(Integer[]::new);
        
        System.out.println("MergedAndSortedArray : "+Arrays.toString(mergedAndSortedArray));
        
        System.out.println("=======================minimum and maximum==============================");
        
        List<Integer> y =Arrays.asList(1,4,2,6,3,5);
        
        List<Integer> l =y.stream().sorted().limit(3).distinct().collect(Collectors.toList());
        
        List<Integer> u = y.stream().sorted((a,b)->b.compareTo(a)).limit(3).distinct().collect(Collectors.toList());
        l.forEach(l1 ->System.out.println("minimum sorted list : "+l1));
        System.out.println(" ");
        u.forEach(l2 ->System.out.println("minimum revers list : "+l2));
        
        System.out.println("=======================sum of all digits==============================");
        
        
        int num =1254;
        
        int sum = String.valueOf(num).chars().map(Character::getNumericValue).sum();
        		

//        List<Integer> arrop = Arrays.asList(2,4,5,8,100,9,6);
//        arrop.rev
        System.out.println("=======================second largest element==============================");        
        Integer arri[] = {2,4,5,8,100,9,6};
        
        Arrays.sort(arri, Collections.reverseOrder());
        System.out.println(Arrays.toString(arri));        
        System.out.println("second larget element" +arri[1]);
        
        System.out.println("======================= sCommon element in both array ==============================");   
        
        Integer[] arr3 = {1,2,3,4,5};
        Integer[] arr4 = {7,8,3,4,5};

        Set<Integer> er = Arrays.stream(arr3).collect(Collectors.toSet());
        
        List <Integer> h11 = Arrays.stream(arr4).filter(c-> er.contains(c)).collect(Collectors.toList());
        System.out.println("Common element in both array "+h11);
        h11.forEach(hp->System.out.println("Common element in both array " + hp));
        
        System.out.println("======================= first element is integer check=========================");
        
        List<String> l1 = Arrays.asList("123abc", "abc123", "456def", "def456", "789ghi");
        
        List<String> k = l1.stream().filter(s-> Character.isDigit(s.charAt(0))).collect(Collectors.toList());
        
        System.out.println("LIST of digit : "+k);
        
        System.out.println("======================= print first 10 odd element =========================");
       
        IntStream.iterate(1, c->c+2).limit(10).forEach(System.out::println);
                
        System.out.println("======================= Calculate age java 8 =========================");
        
        LocalDate birthdate = LocalDate.of(1995, 11, 18);
        
        LocalDate todayDate = LocalDate.now();
        
        int age = Period.between(birthdate, todayDate).getDays();
        
        System.out.println("ageee : "+age);
        
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current LocalDateTime: " +  LocalDateTime.now());
        
        System.out.println("======================= Calculate age java 8 =========================");
        
        
	}

}
