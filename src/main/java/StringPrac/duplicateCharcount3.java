package StringPrac;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateCharcount3 {
public static void main(String[] args) {
	duplicateCount("hello hi how are you all");
}
public static void duplicateCount(String s1) {
	char[]words = s1.toCharArray();
	Map<Character, Integer>charMap = new HashMap<Character, Integer>();
	for(Character ch:words) {
		if(charMap.containsKey(ch)) {
			charMap.put(ch, charMap.get(ch)+1);
		}
		else {
			charMap.put(ch, 1);
		}
	}
	Set<Map.Entry<Character, Integer>>entries = charMap.entrySet();
	for (Entry<Character, Integer> entry:entries) {
		if(entry.getValue()>1) {
		
		System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
}
