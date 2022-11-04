package ArrayPractice;

public class CopyArray {
	public static void main(String[] args) {
		int[]num1=new int[] {1,2,3,6,7,8};
		int[]num2=new int[num1.length];
		
		for (int i =0 ; i<num1.length;i++) {
			
			num2[i]=num1[i];
			System.out.print(num1[i]+" ");
		}
		System.out.println();
		for (int i =0 ; i<num2.length;i++) {
			System.out.print(num2[i]+" ");
		}
	}

}
