package StringPrac;

public class DuplicateArraychars {
	public static void main(String[] args) {
		
	
	int [] s1 = new int[] {1,4,5,6,6,6,7,8,9,9,2};
	int freq[]=new int[s1.length];
	int visited = -1;
	
	for (int i = 0 ; i<=s1.length-1;i++) {
		int count = 1;
		for (int j=i+1;j<=s1.length-1;j++) {
			if (s1[i]==s1[j]) {
				
			
			count++;
			freq[j]=visited;
		}
		}
		if (freq[i]!=visited) {
			freq[i]=count;
		}
	}
	for (int i = 0 ; i<=freq.length-1 ; i++) {
		if (freq[i]!=visited) {
			System.out.println(s1[i] + " "+":"+ freq[i]);
		}
	}

}
}