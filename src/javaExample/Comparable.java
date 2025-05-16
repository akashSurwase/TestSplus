package javaExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javaExample.dto.laptop;

public class Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<laptop> lst = new ArrayList<>();
		lst.add(new laptop(100,20,"dell"));
		lst.add(new laptop(30000,10,"apple"));
		lst.add(new laptop(200,30,"hp"));
		
		Collections.sort(lst);
		
		lst.forEach(e->System.out.println("Comparable : " +e));	

	}

}
