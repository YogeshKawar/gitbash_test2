package String;

import java.util.LinkedHashSet;

public class Q_removeDuplicate {
	public static void main(String[] args) {
		removeduplicate("Suraj Jadhav");
	}
	
	public static void removeduplicate(String str) {
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i=0;i<=str.length()-1;i++) {
			set.add(str.charAt(i));
		}	
			for ( Character ch : set) {
				System.out.print(ch);
			}
		}
	}


