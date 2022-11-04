package String;

import java.util.Arrays;

public class H_anagram {
	public static void main(String[] args) {
		String s1="Bag";
		String s2 ="Bat";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if (s1.length()!=s2.length()) {
			System.out.println("Entered String is not anagram");
		}
		else {
		
		char[] Strings1=s1.toCharArray();
		char[] String2=s2.toCharArray();
		
		Arrays.sort(Strings1);
		Arrays.sort(String2);
		
		if(Arrays.equals(Strings1, String2)==true) {
			System.out.println("Both String are anagram");
		}
		else {
			System.out.println("Both Strings are not anargam");
		}
		}
	}

}

