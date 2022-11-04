package Numbers;

public class N_PerfectSqr {
	public static void main(String[] args) {
		int num=144;
		System.out.println("Is the entered number is perfect square -:"+perfectsqr(num));
	}
	 public static boolean perfectsqr(int num) {
		 int x = num%10;
		 if (x ==2|| x==3||x==7||x==8) {
			 return false;
		 }
		 for (int i=0 ; i<=num ; i++) {
			 if(i*i==num) {
				 return true;
			 }
		 }
		return  false;
	}
}