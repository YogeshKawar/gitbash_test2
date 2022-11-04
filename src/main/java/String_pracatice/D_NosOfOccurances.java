package String_pracatice;

public class D_NosOfOccurances {
	public static void main(String[] args) {
		String name ="Suraj Jadhav";
		name = name.toLowerCase();
		int totalLength=name.length();
		String name1= name.replace("a", "");
		int lengthAfterRemoval = name1.length();
		
		int count = totalLength - lengthAfterRemoval;
		System.out.println("Entered String -:"+name+"\n");
		System.out.println("Total count of character 'a' present in string is -: "+count);
	}

}
