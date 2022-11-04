package ArrayPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Max_Min {
	
		public static void main(String [] args){
		String name = "suraj jadhav";

		char [] name1 = name.toCharArray();

		Map<Character , Integer> words = new HashMap<Character, Integer>();

		for (Character ch : name1){
		if (words.containsKey(ch)){
		words.put(ch,words.get(ch)+1);
		}
		else {
		words.put(ch,1);
		}
		}
		Set<Map.Entry<Character , Integer>> entrySet=words.entrySet();
		for (Map.Entry<Character , Integer> entry : entrySet){
		if(entry.getValue()>1){
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
		}
}
}