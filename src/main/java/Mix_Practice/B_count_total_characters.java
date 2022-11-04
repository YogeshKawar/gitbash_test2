package Mix_Practice;

public class B_count_total_characters {
	public static void main(String[] args) {
		String sentence = "Hello I am from Thane";
		int count=0;
		for(int i =0 ; i<sentence.length();i++) {
			if (sentence.charAt(i)!=' ') {
				
				count++;
			}
		}
		System.out.println("Total characters present in the entered sentence is -:"+count);
	}

}
