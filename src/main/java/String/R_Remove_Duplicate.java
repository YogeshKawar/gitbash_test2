package String;

import java.util.TreeSet;

public class R_Remove_Duplicate {
	public static void main(String[] args) {
		char [] num= new char [] {'a','b','c','g','h','i','k','a','b'};
		
		TreeSet<Character>Set = new TreeSet<Character>();
		for (int i = 1; i<=num.length-1;i++) {
			Set.add(num[i]);
			
		}
		for(Character one:Set) {
			System.out.print(one+" ");
		}
		
	}

}
