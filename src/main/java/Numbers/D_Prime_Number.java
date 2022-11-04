package Numbers;

public class D_Prime_Number {
	public static void main(String[] args) {
		int b = 1 ;
		int count = 0 ;
		
		for (int i=1 ; i<=b ; i++) {
			if (b%i==0) {
				count ++ ;
			}
			
		}
		
		if (count ==2) {
			System.out.println("Entered number is Prime Number");
		}
		
		else {
			System.out.println("Entered number is not Prime Number");
		}
		
		System.out.println("Total count = "+ count);
	}

}
