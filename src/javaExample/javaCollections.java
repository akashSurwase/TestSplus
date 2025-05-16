package javaExample;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class javaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Array		
		List<String> lst = new ArrayList<String>();
		lst.add("Akash");
		lst.add("Mahesh");
		lst.add("Kiran");
		lst.add("Pooja");
		
		System.out.println("list.. "+lst);
		lst.add(1,"Rohit");
		System.out.println("list.. "+lst);
		lst.remove(1);
		System.out.println("list.. "+lst);
		lst.set(3,"Ankush");
		System.out.println("list.. "+lst);
		
		
System.out.println("////////////////////////////////////////////////////////////////////");		

		LinkedList<String> link = new LinkedList<String>();
		link.add("Akash");
		link.add("Pooja");
		link.addFirst("jk");
		link.addLast("jkk");
		System.out.println("linkelist >> "+link);

System.out.println("////////////////////////////////////////////////////////////////////");

		Stack<String> stack = new Stack<String>();  // LIFO
		stack.push("Akash");
		stack.push("Pooja");
		stack.push("kh");
		System.out.println("stack >> " +stack);
		stack.pop();
		System.out.println("stack >> " +stack);
		
System.out.println("////////////////////////////////////////////////////////////////////");

		ArrayDeque<String> arrayDeque = new ArrayDeque<String>();  // FIFO
		arrayDeque.push("Akash");
		arrayDeque.push("Pooja");
		arrayDeque.push("kh");
		System.out.println("arrayDeque >> " +arrayDeque);
		arrayDeque.pop();
		System.out.println("arrayDeque >> " +arrayDeque);

System.out.println("////////////////////////////////////////////////////////////////////");
	}

}
