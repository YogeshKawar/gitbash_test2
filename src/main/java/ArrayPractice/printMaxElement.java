package ArrayPractice;

public class printMaxElement {
	public static void main(String[] args) {
		int [] n1= new int[] {1,2,3,4,5,9,6};
		int max = 0;
		for (int i=0 ; i<n1.length ; i++) {
			
			if (n1[i]>max) {
				max=n1[i];
			}
			
		}
		System.out.println(max+" ");
	}

}
