package StringPrac;

public class DuplicateArray {
	public static void main(String[] args) {
		
	
	int[] arr1=new int[] {1,2,3,5,6,6,8,9};
	int [] freq = new int[arr1.length];
	int visited = -1;
	
	for (int i = 0 ; i<= arr1.length-1;i++) {
		int count = 1;
		for (int j = i+1 ; j<=arr1.length-1;j++) {
			if(arr1[i]==arr1[j]) {
				count++;
				freq[j]=visited;
			}
			
		}
		if (freq[i]!=visited) {
			freq[i]=count;
		}
	}
	for (int i=0 ; i<=freq.length-1 ; i++) {
	if (freq[i]!=visited) {
		System.out.println(arr1[i]+" "+ freq[i]);
	}

}

}
}