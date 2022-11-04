package StringPrac;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateString {
	public static void main(String[] args) {
		String name ="suraj jadhav";
		
		char [] name1 = name.toCharArray();
		Map<Character, Integer> chars = new HashMap<Character, Integer>();
		
		for (Character one : name1) {
			if(chars.containsKey(one)) {
				chars.put(one, chars.get(one)+1);
				}
			else {
				chars.put(one, 1);
			}
		}
			Set<Map.Entry<Character, Integer>> words = chars.entrySet();
			for (Map.Entry <Character, Integer> word : words) {
				if (word.getValue()>1) {
					System.out.println(word.getKey() + " : "+ word.getValue());
				}
			}
		}
	}


