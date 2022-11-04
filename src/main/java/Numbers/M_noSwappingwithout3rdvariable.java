package Numbers;

public class M_noSwappingwithout3rdvariable {
	public static void main(String[] args) {
		int A= 30;
		int B=20;
		
		System.out.println("Value of 'A' before swapping -:"+A);
		System.out.println("Value of 'B' before swapping -:"+B);
		System.out.println();
		
		A=A+B;
		B=A-B;
		A=A-B;
		
		System.out.println("Value of 'A' after swapping -:"+A);
		System.out.println("Value of 'B' after swapping -:"+B);
	}

}
