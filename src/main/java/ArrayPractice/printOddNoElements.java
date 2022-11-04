package ArrayPractice;

public class printOddNoElements {
	public static void main(String[] args) {
		int [] n1= new int [] {1,2,3,4,5,6,7};
		
		for (int i=0; i<n1.length;i=i+2) {
			System.out.print(n1[i]+" ");
		}
	}

}
