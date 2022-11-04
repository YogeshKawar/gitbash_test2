package String_pracatice;

public class J_change_case_sensitiveness {
	public static void main(String[] args) {
		String name="sURAJ jADHAV";
		
		System.out.println("Entered String -: "+name+"\n");
		
		StringBuffer name1 = new StringBuffer(name);
		
		for (int i=0 ; i<=name.length()-1;i++) {
			
			if(Character.isLowerCase(name.charAt(i))) {
			name1.setCharAt(i, Character.toUpperCase(name.charAt(i)));
			}
			
			else if (Character.isUpperCase(name.charAt(i))) {
				name1.setCharAt(i, Character.toLowerCase(name.charAt(i)));
			}
		}
		
		System.out.println("After performing action on entered String -: "+name1);
		
	}

}
