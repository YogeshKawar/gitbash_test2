package String;

public class F_count_total_characters {
	public static void main(String[] args) {
		String name= "Hello World";
		int count =0;
		
		for(int i=0 ; i<=name.length()-1;i++) {
			if (name.charAt(i)!=' ') {
				count++;
				
			}
		}
		System.out.println("Total character count-:"+count);
	}

}
