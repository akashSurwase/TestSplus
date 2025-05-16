package javaExample.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class javac {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input: nums = [3,0,1]Output: 2
//				Explanation: n = 3 since there are 3 numbers, 
//				so all numbers are in the range [0,3].
//				2 is the missing number in the range since it does not appear in nums.
		
		 Integer[] num = {0,2};
		 
//		 [9,6,4,2,3,5,7,0,1]
		 		 
		 System.out.println("i>>> ");

		 int n=0;
		 int h =num.length;
		 
		 for(int i=0; i < num.length; i++) {			 
			 
			 if(num[i] != i) {
				 n=i;
			 }
		 }
		 
		 System.out.println("number = " + n);
		
		 
		 
			List<Employee> lst = new ArrayList<>();
			lst.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
	        lst.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
	        lst.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
	        lst.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
	        lst.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
	        lst.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
	        lst.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
	        lst.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
	        lst.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
	        lst.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
	        lst.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
	        lst.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
	        lst.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
	        lst.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
	        lst.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
	        lst.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
	        lst.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
			
			
	          Map y = lst.stream().map(c->c.getGender()).collect(Collectors.groupingBy(v->v, Collectors.counting()));
	        
	          
	          int i = lst.stream().map(v->v.getAge()).sorted(Collections.reverseOrder()).findFirst().get();
	          System.out.println("oldest age > "+i);
		

	}

}
