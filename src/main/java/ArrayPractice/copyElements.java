package ArrayPractice;

public class copyElements {
	public static void main(String[] args) {
		int [] n1 = new int[] {1,2,3,4,5,6,7};
		int n2[] =new int[n1.length] ;
		
		System.out.println("Printing n1 elements");
		
		for (int i=0 ; i<n1.length;i++) {
			
		   System.out.print(n1[i]+" ");
		}
		System.out.println();
		
		for (int i=0 ; i<n1.length;i++) {
			n2[i]=n1[i];
			
		}
		
		
		System.out.println("Printing n2 elements");
		
		 for (int i=0 ; i<n2.length;i++){
			 System.out.print(n2[i]+" ");
			
		}
	}

}
