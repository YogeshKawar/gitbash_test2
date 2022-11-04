package Arrays;

public class copyArrays {
	public static void main(String[] args) {
		int[] arr1=new int[] {1,2,3,4,5};
		int[]arr2=new int[arr1.length];
		
		for (int i=0 ; i<=arr1.length-1;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("Enter array 1 -:");
		for (int i=0 ; i<=arr1.length-1;i++) {
			System.out.print(arr1[i]+" ");
			
		}
		System.out.println();
		System.out.println("Array 2 after copying array 1 elements -:");
		for (int i=0 ; i<=arr2.length-1;i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}

}
