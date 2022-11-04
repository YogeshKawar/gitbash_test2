package ArrayPractice;

public class frequcnyCount1 {
	public static void main(String[] args) {
		int [] n1 = new int[] {1,3,2,4,3,3,4,5,5};
		int [] freq = new int [n1.length];
		int visited =-1;
		for (int i = 0 ; i<n1.length;i++) {
			int count = 1;
			for (int j= i+1 ; j<n1.length;j++) {
				if (n1[i]==n1[j]) {
					count++;
					freq[j]=visited;
				}
			}
			if (freq[i]!=visited) {
				freq[i]=count;
			}
		}
		for (int i = 0; i<freq.length;i++)
		if(freq[i]!=visited) {
			System.out.println(n1[i]+"         "+freq[i]);
			
		}
	

}
}