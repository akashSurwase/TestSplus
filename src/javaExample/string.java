package javaExample;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "code";
		String s2 ="code";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("==========================");
		
		String s3 = new String("code");
		String s4 = new String("code");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		System.out.println("==========================");
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		System.out.println("==========================");
		
		StringBuffer sb = new StringBuffer("Hello");
        sb.replace(1, 3, "Java");
        System.out.println(sb);
        
        System.out.println("=========================================");
        StringBuffer sb1 = new StringBuffer();
        sb1.append("Hello");
        sb1.append(" ");
        sb1.append("world");
        String message = sb1.toString();
        System.out.println(message);        

        
//        String vs String buffer

//        1)	The String class is immutable.	
//			The StringBuffer class is mutable.
//        2)	String is slow and consumes more memory when we concatenate too many strings because every time it creates new instance.	
//			StringBuffer is fast and consumes less memory when we concatenate the strings.
//        3)	String class overrides the equals() method of Object class. So you can compare the contents of two strings by equals() method.	
//			StringBuffer class doesn't override the equals() method of Object class.
//        4)	String class is slower while performing concatenation operation.	
//			StringBuffer class is faster while performing concatenation operation.
//        5)	String class uses String constant pool.	
//			StringBuffer uses Heap memory
        
	}

}
