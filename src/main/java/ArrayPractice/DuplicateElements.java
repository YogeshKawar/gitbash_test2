package ArrayPractice;

public class DuplicateElements {
	public static void main(String[] args) {
		int [] s2=new int[] {1,2,2,6,4,5,6,3,4};
		
		for (int i=0 ; i<s2.length;i++) {
			for (int j = i+1 ; j<s2.length;j++) {
				if (s2[i]==s2[j]) {
					System.out.println(s2[j]+" ");
				}
			}
		}
	}

}
