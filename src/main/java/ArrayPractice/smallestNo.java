package ArrayPractice;

public class smallestNo {
	public static void main(String[] args) {
		int[] n1 = new int[] {3,4,6,8,1,2};
		int min=n1[0];
		
		for (int i=0 ; i<n1.length;i++) {
			if (n1[i]<min) {
				min=n1[i];
			}
			
		}
		System.out.println(min+" ");
	}

}
