package String;

public class M_replace_lower_to_upper_upper_to_lower {
	public static void main(String[] args) {
		String s1="hI hELLO";
		StringBuffer revs1 = new StringBuffer(s1);
		
		for (int i=0 ; i<s1.length();i++) {
			//Checking for lower case
			if(Character.isLowerCase(s1.charAt(i))) {
		   //convert to upper case
			revs1.setCharAt(i, Character.toUpperCase(s1.charAt(i)));
		}
		//checking for upper case
		else if (Character.isUpperCase(s1.charAt(i))) {
			//covert to lower case
			revs1.setCharAt(i, Character.toLowerCase(s1.charAt(i)));
		}
	}
		System.out.println(revs1);

}
}