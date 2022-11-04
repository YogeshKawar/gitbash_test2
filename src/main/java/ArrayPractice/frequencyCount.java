package ArrayPractice;

public class frequencyCount {
	public static void main(String[] args) {
		int [] num1 = new int[] {2,3,4,1,2,3,4};
		int freq[] = new int [num1.length] ;
		int visited =-1;
		
		for (int i=0; i<num1.length; i++) {
			int count =1;
			for (int j=i+1 ; j<num1.length;j++) {
				if (num1[i]==num1[j]) {
					count++;
					freq[j]=visited;
				}
			}
			if (freq[i]!=visited) {
				freq[i]=count;
			}
		}
		System.out.println("Numbers"+ "  :  "+"Frequency");
		for(int i =0 ; i<freq.length;i++) {
			if(freq[i]!=visited) {
				System.out.println(num1[i]   + "        :       "+freq[i]);
			}
		}
	}

}
