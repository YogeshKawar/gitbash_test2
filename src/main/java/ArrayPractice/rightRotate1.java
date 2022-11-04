package ArrayPractice;

public class rightRotate1 {
	public static void main(String[] args) {
		int[] n1=new int[] {1,2,3,4,5};
		int n=3;
		
		System.out.println("Array before right rotate");
		
		for(int i=0; i<n1.length;i++) {
			System.out.print(n1[i]+" ");
		}
		System.out.println();
		for(int i=0 ; i<n;i++) {
			int j;
			int last = n1[n1.length-1];
			for (j=n1.length-1;j>0;j--) {
				n1[j]=n1[j-1];
			}
			n1[j]=last;
		}
		System.out.println("Array after right rotate");
		for (int i=0 ;i<n1.length;i++) {
			System.out.print(n1[i]+" ");
		}
	}

}
