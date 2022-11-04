package Practice_test;

import java.util.Arrays;

public class D_Anagram {
	public static void main(String[] args) {
		String s1="Tall";
		String s2="Toy";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] String1=s1.toCharArray();
		char[] String2 = s2.toCharArray();
		
		Arrays.sort(String1);
		Arrays.sort(String2);
		
		if (Arrays.equals(String1, String2)) {
			System.out.println("Entered Strings are anagram");
		}
		else {
			System.out.println("Entered String are not anagram");
		}
	}

}
