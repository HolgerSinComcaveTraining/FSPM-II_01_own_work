package junitdemo;

public class ReverseStrings {
	
	public static String reverse(String str) {
		
		return new StringBuilder(str).reverse().toString();
		
	}

}
