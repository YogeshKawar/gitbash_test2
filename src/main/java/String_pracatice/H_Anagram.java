package String_pracatice;

import java.util.Arrays;

public class H_Anagram {
	public static void main(String[] args) {
		String a = "bat";
		String b="ata";
		
		System.out.println("String 'a' -: "+a+"\n"+"String 'b' -: "+b+"\n");
		
		if (a.length()!=b.length()) {
			System.out.println("Entered both strings are not anagram of each others.");
		}
		else {
			
			char []a1 = a.toCharArray();
			char []b1 =b.toCharArray();
			
			Arrays.sort(a1);
			Arrays.sort(b1);
			
			if (Arrays.equals(a1, b1)) {
				System.out.println("Entered both strings are anagram of each others");
			}
			else {
				System.out.println("Entered both strings are not anagram of each others.");
			}
		}
	}

}
