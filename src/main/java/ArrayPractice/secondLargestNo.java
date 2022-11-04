package ArrayPractice;

public class secondLargestNo {
	public static void main(String[] args) {
		int [] n = new int[] {1,3,6,8,10,9};
		int temp=0;
		int secndNo = 0;
		for (int i=0; i<n.length;i++) {
			for (int j =0 ; j<n.length;j++) {
				if(n[i]>n[j]) {
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
			
				
			}
		for (int i=n.length-1 ; i>=0;i++) {
			secndNo = n[1]; 
			
		}
		System.out.println(secndNo);
	}

}
