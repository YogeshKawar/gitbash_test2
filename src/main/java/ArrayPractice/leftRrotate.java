package ArrayPractice;

public class leftRrotate {
	public static void main(String[] args) {
		int[] n1 = new int [] {1,2,3,4,5,};
		int n =3;
		
		System.out.println("Printing elements");
		for(int i=0 ; i<n1.length;i++) {
			System.out.print(n1[i]+ " ");
		}
		
		for (int i=0 ; i<n;i++) {
			int first;
			int j;
			first=n1[0];
			
			for (j=0;j<n1.length-1;j++) {
				n1[j]=n1[j+1];
			}
			n1[j]=first;
		}
		System.out.println();
		System.out.println("Printing left Reverse");
		
		
		
		for (int i=0; i<n1.length;i++) {
			System.out.print(n1[i]+" ");
		}
	}

}
