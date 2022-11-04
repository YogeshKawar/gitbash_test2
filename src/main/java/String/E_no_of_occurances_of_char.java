package String;

public class E_no_of_occurances_of_char {
	public static void main(String[] args) {
		String old = "Suraj jadhav from Thane";
		int totalCount =old.length();
		String afterRemovingChar = old.replace("j", "");
		int revCount= afterRemovingChar.length();
		int count = totalCount-revCount;
		System.out.println("Total count of character j -:"+count);
		
		
		
	}

}
