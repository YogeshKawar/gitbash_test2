package ArrayPractice;

public class leftRorate {
	public static void main(String[] args) {
		int n2[] = new int[] {1,2,3,4,5,6};
		int n =3;
		
		System.out.println("Printing n2 Elements without left rotate");
		for (int i = 0 ; i<n2.length;i++) {
			System.out.print(n2[i]+" ");
		}
		
		for (int i=0 ; i<n;i++) {
			int j;
			int first;
			first=n2[0];
			for (j=0;j<n2.length-1;j++) {
				n2[j]=n2[j+1];
			}
			n2[j]=first;
		}
		System.out.println();
		System.out.println("Printing left rotate elements after rorating");
		
		for (int i=0 ; i<n2.length;i++) {
			System.out.print(n2[i]+" ");
		}
	}

}
