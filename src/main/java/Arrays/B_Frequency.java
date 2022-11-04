package Arrays;

public class B_Frequency {
	public static void main(String[] args) {
		int[]s1=new int[] {1,2,2,3,4,4,5,6,6};
		int [] freq=new int[s1.length];
		int visited=-1;
		
		for (int i=0 ; i<=s1.length-1;i++) {
			int count=1;
			for(int j=i+1;j<=s1.length-1;j++) {
				if(s1[i]==s1[j]) {
					count++;
					
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited) {
				freq[i]=count;
			}
		}
		System.out.println("Total frequency of numbers -: ");
		for (int i= 0 ; i<=freq.length-1;i++) {
			if(freq[i]!=visited) {
				System.out.println(s1[i]+" "+":"+" "+freq[i]);
			}
		}
	}

}
