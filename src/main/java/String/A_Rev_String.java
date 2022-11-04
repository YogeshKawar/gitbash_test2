package String;

public class A_Rev_String {
	public static void main(String[] args) {
		String old = "Nayan";
		String rev="";
		
		for (int i =old.length()-1 ; i>=0 ; i--) {
			char ch=old.charAt(i);
			rev= rev+ch;
		}
		System.out.println(rev);
		
		if (rev.equals(old)) {
			System.out.println("Entered name is Palindrome");
		}
		else {
			System.out.println("Entered name is not Palindrome");
		}
	}

}
