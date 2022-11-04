package String_pracatice;

public class F_vowels_consonants_space_count {
	public static void main(String[] args) {
		String s = "Suraj Jadhav from @ Thane ";
		System.out.println("Enter the String -: "+s+"\n");
		s=s.toLowerCase();
		int vCount =0;
		int cCount=0;
		int sCount =0;
		int splChar=0;
				
		for (int i=0 ; i<=s.length()-1;i++) {
			
			if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)==i) {
				vCount++;
			}
			else if (s.charAt(i)>='a'&& s.charAt(i)<='z') {
				cCount++;
			}
			else if (s.charAt(i)==' ') {
				sCount++;
			}
			else {
				splChar++;
			}
		}
		
		System.out.println("Numbers of Vowels present in entered String -: "+vCount+"\n");
		System.out.println("Numbers of Consonant present in entered string -: "+cCount+"\n");
		System.out.println("Numbers of Spaces present in entered string -: "+sCount+"\n");
		System.out.println("Numbers of special characters present in string -: "+splChar+"\n");
	}

}
