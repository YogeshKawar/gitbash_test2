package ArrayPractice;

public class sorrtArray {
	public static void main(String[] args) {
		int[] num = new int[] {1,4,6,8,5,3};
		
		
		System.out.println("array before sort");
		for (int i = 0 ; i<num.length;i++) {
			
			System.out.print(num[i]+" ");
			int temp=0;
			for (int j=i+1;j<num.length;j++) {
				if (num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
			
		}
		System.out.println();
		System.out.println("Array after sort");
		for (int i=0 ; i<num.length;i++) {
			
		
		System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println("Array length");
		System.out.println(num.length-1);
		System.out.println("Min number");
		System.out.print(num[0]);
		
		System.out.println();
		System.out.println("Max number");
		System.out.println(num[5]);
	
	}

}
