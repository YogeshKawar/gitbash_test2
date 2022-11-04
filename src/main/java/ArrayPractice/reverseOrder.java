package ArrayPractice;

public class reverseOrder {
	public static void main(String[] args) {
		int [] num = new int[] {1,2,3,4,5,6,7};
		
		for (int i=num.length-1;i>=0;i--) {
			System.out.print(num[i]+" ");
		}
	}

}
