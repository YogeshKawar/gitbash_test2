package String_pracatice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class K_repitative_char_frquency {
	public static void main(String[] args) {
		duplicateChar("hello how are you");
		
	}
	public static void duplicateChar(String str) {
		System.out.println("Entered String -: "+str+"\n");
		if (str==null) {
			System.out.println("Null string");
		}
		if(str.length()==1) {
			System.out.println("Entered string only has 1 character");
		}
		if(str.isEmpty()) {
			System.out.println("Entered string is empty");
		}
		char[]words=str.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for (Character ch:words) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}
			else {
				charMap.put(ch, 1);
			}
		}
		System.out.println("Count of duplicate characters present in entered string -: ");
		Set<Map.Entry<Character, Integer>>entrySet=charMap.entrySet();
		for(Map.Entry<Character, Integer> entry:entrySet) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
		
		
	}

}



