package ArrayPractice;

public class printElementOnEvenNo {
	public static void main(String[] args) {
		int[] n1 = new int [] {1,2,3,4,5,6};
		
		for (int i= 1; i<n1.length;i=i+2) {
			System.out.print(n1[i]+" ");
		}
	}

}
