package Practice_test;

public class C_Vowels_consanats {
	public static void main(String[] args) {
		
	
	String s1= "hello how are you all";
	int vCount =0;
	int cCount =0;
    s1=s1.toLowerCase();
	
    for ( int i=0 ; i<=s1.length()-1;i++) {
    	if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u') {
    		vCount++;
    	}
    	else if (s1.charAt(i)>='a' && s1.charAt(i)<='z') {
    		cCount++;
    	}
    }
    System.out.println("Total numbers of vowels -: "+vCount);
    System.out.println("Total numbers of consonats -: "+cCount);

}
}