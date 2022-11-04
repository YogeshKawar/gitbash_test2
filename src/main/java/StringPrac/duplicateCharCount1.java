package StringPrac;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicateCharCount1 {
	public static void main(String[] args) {
		duplicateChar("hiihhiiihhhiihhhiiiiihhiiii");
	}
	public static void duplicateChar(String s1) {
		char []words=s1.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(Character ch : words) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}
			else {
				charMap.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>>entrySet1=charMap.entrySet();
		for (Map.Entry<Character, Integer>entry:entrySet1) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" "+":"+" "+entry.getValue());
			}
		}
	}
}
