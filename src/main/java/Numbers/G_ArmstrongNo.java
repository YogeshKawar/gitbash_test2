package Numbers;

public class G_ArmstrongNo {
	public static void main(String[] args) {
		int no = 153;
		int Num = no;
		int temp=no;
		int sum=0;
		int count =0;
		
		for (int i=no ; i>0 ; i=i/10) {
			if (i>0) {
				count++;
			}
		}
		System.out.println("Total digit count "+count);
		
		while(temp>0) {
			int multi=1;
			for (int j=1 ; j<=count ; j++) {
				int rem=temp%10;
				multi=multi*rem;
			}
			sum = sum + multi;
			temp=temp/10;
			
			
		}
		System.out.println("Answer "+sum);
		if (sum==Num) {
			System.out.println("Entered Number is armstorng Number");
		}
		else {
			System.out.println("Entered number is not armstrong number");
		}
	}
}
