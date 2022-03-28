package org.cts;

public class Company {
	
	public  void Test() {
		
		String s = "Thiagu";
		String s1 = "Thiagu";
	
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		String ss = new String("thiyagu");
		String st = new String("thiyagu");
		System.out.println(System.identityHashCode(ss));
		System.out.println(System.identityHashCode(st));
		
		String s4 = "Java";
		String s5 = "Program";
		System.out.println(System.identityHashCode(s4));
		s4 = s4.concat(s5);
		System.out.println(s4);
		System.out.println(System.identityHashCode(s4));
		
		
	}	
	
	public static void main(String[] args) {
		Company c = new Company();
		c.Test();
		
		
	}
}
