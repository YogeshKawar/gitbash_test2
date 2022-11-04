package Numbers;

public class O_perfectsqr {
	public static void main(String[] args) {
		int num = 121;
		System.out.println("Is the enter number perfect square -:"+checkperfectsquare(num));
	}
	private static boolean checkperfectsquare(int num) {
	int x = num%10;
	//perfect square never end with 2, 3, 7, and 8  
	if (x==2||x==3||x==7||x==8) {
		return false;
	}
	for(int i=0 ; i<=num;i++) {
		if(i*i==num) {
			return true;		
		}
	}
	return false;
	}
}
