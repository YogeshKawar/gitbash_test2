package count_single_char_occurances;

public class A {
	public static void main(String[] args) {
		String sentence = "Hello how are you";
		sentence=sentence.toLowerCase();
		int sentencelen = sentence.length();
		String revSentence=sentence.replace("o", "");
		int revsenlen=revSentence.length();
		int totalCount=sentencelen-revsenlen;
		System.out.println("Total count of 'o' is -:"+totalCount);
				
	}

}
