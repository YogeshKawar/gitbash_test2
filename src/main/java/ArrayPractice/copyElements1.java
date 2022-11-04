package ArrayPractice;

public class copyElements1 {
	public static void main(String[] args) {
		int[] num1=new int[] {1,2,3,4,5,6,7};
		int[] num2 =new int[num1.length] ;
		
		System.out.println("Printing num1 elements");
		
		for (int i=0;i<num1.length;i++) {
			System.out.print(num1[i]+" ");
		}
		
		System.out.println();
		
		for (int i = 0 ; i<num1.length;i++) {
			num2[i]=num1[i];
		}
		
		System.out.println();
		
		System.out.println("Printing num 2 elements");
		
		for (int i =0;i<num2.length;i++) {
			System.out.print(num2[i]+" ");
		}
	}

}
