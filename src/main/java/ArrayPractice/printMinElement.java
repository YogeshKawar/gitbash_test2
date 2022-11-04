package ArrayPractice;

public class printMinElement {
	public static void main(String[] args) {
		int [] n2=new int[] {0,1,9,5,7,5};
		int min=n2[0];
		
		for (int i=0;i<n2.length;i++) {
			if(n2[i]<min) {
				min=n2[i];
			}
		}
		System.out.println(min);
	}

}
