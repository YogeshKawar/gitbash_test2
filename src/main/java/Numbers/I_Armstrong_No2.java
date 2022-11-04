package Numbers;

public class I_Armstrong_No2 {
	public static void main(String[] args) {
		int num= 153;
		int sum=0;
		int count =0;
		int temp = num;
		int no=num;
		System.out.println("Entered Number-:"+num);
		for (int i = num ; i>0 ; i=i/10) {
			count++;
		}
		System.out.println("Total count-: "+ count);
		while(temp>0) {
			int multi=1;
			for (int j =1 ; j<=count ; j++) {
				int rem=temp%10;
				multi = multi * rem;
			}
			sum = sum+multi;
			temp= temp/10;
		}
		System.out.println("Final answer after calculation-: "+sum);
		
		if (sum==no) {
			System.out.println("Entered number is Armstrong Number");
		}
		else {
			System.out.println("Entered Number is not Armstrong Number");
		}
	}
}

