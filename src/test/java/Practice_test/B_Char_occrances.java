package Practice_test;

public class B_Char_occrances {
	public static void main(String[] args) {
		String s1= "I am Suraj Jadhav";
		s1=s1.toLowerCase();
		int String1=s1.length();
		
		String s2 = s1.replace("a", "");
		int String2 = s2.length();
		
		int chCount = String1 - String2;
		
		System.out.println("Total no of 'a' present in string -:"+chCount);
	}

}
