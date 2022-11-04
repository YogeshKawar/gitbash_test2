package ArrayPractice;

public class freqCount2 {
	public static void main(String[] args) {
		int[] num = new int [] {1,2,3,4,5,6,3,4,5,3,4,5,6};
		int freq[] = new int[num.length] ;
		int visited =-1;
		
		for (int i =0 ; i<num.length;i++) {
			int count=1;
			for (int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited) {
				freq[i]=count;
			}
		}
		for (int i=0 ; i<freq.length;i++) {
			if(freq[i]!=visited) {
				System.out.println(num[i]+"    "+freq[i]);
			}
		}
	}

}
