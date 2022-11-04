package String_pracatice;

public class E_TotalCharacterCounts {
	public static void main(String[] args) {
		String s = "Suraj Jadhav";
		int count = 0;
		for (int i=0 ;i<s.length()-1;i++) {
			if((s.length()-1)!=' ') {
				count++;
			}	
		}
		System.out.println("Enter the String -:"+s+"\n");
		System.out.println("Total characters present in the entered string -:"+count);
	}

}
