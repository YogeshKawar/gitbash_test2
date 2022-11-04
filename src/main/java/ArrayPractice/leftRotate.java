package ArrayPractice;

public class leftRotate {
	public static void main(String[] args) {
		int [] num = new int [] {1,2,3,4,5};
		int n =3;
		
		System.out.println("num elements before rotating");
		
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
		for (int i=0; i<n ; i++) {
			int first;
			int j;
			first=num[0];
			for (j=0;j<num.length-1;j++) {
				num[j]=num[j+1];
			}
			num[j]=first;
		}
		System.out.println();
		System.out.println("num elements after rorating");
		for (int i=0 ; i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}

}
