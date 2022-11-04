package Mix_Practice;

public class C_vowels_and_consanant {
	public static void main(String[] args) {
		String sentence="Hello I am Suraj Jadhav";
		sentence=sentence.toLowerCase();
		int vCount=0;
		int cCount=0;
		for (int i=0 ; i<sentence.length();i++) {
			if(sentence.charAt(i)=='a' || sentence.charAt(i)=='e' || sentence.charAt(i)=='i' || sentence.charAt(i)=='o' || sentence.charAt(i)=='u') {
			vCount++;
		}
		else if (sentence.charAt(i)>'a' && sentence.charAt(i)<'z') {
			cCount++;
		}
	}
		System.out.println("Numbers of vowels present in string -: "+vCount );
		System.out.println("Number of consanant present in string -:"+cCount);

}
}
	
