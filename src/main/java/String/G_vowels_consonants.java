package String;

public class G_vowels_consonants {
	public static void main(String[] args) {
		int vCount=0;
		int cCount=0;
		int sCount=0;
		int splCount=0;
		String name ="hello how are you@";
		name=name.toLowerCase();
		
		for (int i=0; i<=name.length()-1;i++) {
			if (name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
				vCount++;
			}
			else if(name.charAt(i)>='a' && name.charAt(i)<='z') {
				cCount++;
			}
			else if (name.charAt(i)==' ') {
				sCount++;
			}
			else  {
				splCount++;
			}
		}
		System.out.println("Vowels-: "+vCount);
		System.out.println("Conconants -:"+cCount);
		System.out.println("Space -:"+sCount);
		System.out.println("Special symbols -:"+splCount);
	}

}
