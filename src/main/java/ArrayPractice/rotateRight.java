package ArrayPractice;

public class rotateRight {
	public static void main(String[] args) {
		int [] s1=new int[] {1,2,3,4,5,};
		int n =3;
		System.out.println("Before rotate");
		for (int i =0; i<s1.length;i++) {
			System.out.print(s1[i]+" ");
		}
		for (int i =0; i<n ; i++) {
			int last;
			int j;
			last=s1[s1.length-1];
			for(j = s1.length-1; j>0;j--) {
				s1[j]=s1[j-1];
			}
			s1[j]=last;
		}
		System.out.println();
		System.out.println("After rotate");
		for (int i =0; i<s1.length;i++) {
			System.out.print(s1[i]+" ");
		}
	}

}
