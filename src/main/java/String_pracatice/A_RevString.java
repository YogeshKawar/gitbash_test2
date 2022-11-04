package String_pracatice;

public class A_RevString {
	public static void main(String[] args) {
		String oldName="SURAJ";
		String revName="";
		
		for (int i=oldName.length()-1 ; i>=0;i--) {
			char ch = oldName.charAt(i);
			revName=revName+ch;
		}
		System.out.print("Name before reverse -:");
		System.out.println(oldName);
		System.out.print("Name after reverse  -:");
		System.out.println(revName);
	}

}
