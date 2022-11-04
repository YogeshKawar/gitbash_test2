package Mix_Practice;

public class A_Perfect_Square {
	public static void main(String[] args) {
		int num=121;
		System.out.println("Is entered number perfect sqaure -:"+perfectsqr(num));
	}

	private static boolean perfectsqr(int num) {
		int x = num%10;
		if(x==2||x==3||x==7||x==8) {
			return false;
		}
		for (int i=0 ; i<num ; i++) {
			if(i*i==num) {
				return true;
				
			}
		}
		return false;
		
	}
	
	

}
