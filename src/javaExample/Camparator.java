package javaExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javaExample.dto.laptop2;

public class Camparator {

	public static void main(String[] args) {
		
		List<laptop2> lst = new ArrayList<>();
		lst.add(new laptop2(100,20,"dell"));
		lst.add(new laptop2(30000,10,"apple"));
		lst.add(new laptop2(200,30,"hp"));
		System.out.println("Hello..")
		
		Comparator <laptop2> com = new Comparator <laptop2> (){
			
			@Override
			public int compare(laptop2 lap1, laptop2 lap2) {
				if(lap1.getQuatity() > lap2.getQuatity()) {
					return 1;
				}else {
					return -1;
				}
			}
			
		};
		Collections.sort(lst,com);

		lst.forEach(e->System.out.println("comparator : " +e));
		
	}

}
