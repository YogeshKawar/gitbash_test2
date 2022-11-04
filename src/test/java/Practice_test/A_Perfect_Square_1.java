package Practice_test;

public class A_Perfect_Square_1 {
	public static void main(String[] args) {
		int no=25;
		System.out.println("Is entered number is perfect square -:"+perfectSquare(no));
	}

	private static boolean perfectSquare(int no) {
		int x=no%10;
		if (x==2 || x==3 || x==7 || x==8) {
			return false;
		}
		
		for (int i=0 ; i<no ;i++) {
			if(i*i==no) {
				return true;
			}
		}
		return false;
		
	}
	
	

}
