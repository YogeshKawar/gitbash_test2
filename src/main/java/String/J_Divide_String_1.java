package String;

public class J_Divide_String_1 {
	public static void main(String[] args) {
		String s="aaabbbccc";
		int temp =0;
		int length=s.length();
		System.out.println(length);
		int n=3;
		int chars = length/n;
		
		String store[]=new String[n];
		
		if (length%n!=0) {
			System.out.println("Entered String is not divisible by " +n);
		}
		else {
			for (int i=0 ; i<length;i=i+chars) {
				String parts = s.substring(i, i+chars);
				store[temp]=parts;
				temp++;
				
			}
			System.out.println("String is divisible in "+n+ " equal parts");
			for (String a:store) {
				System.out.println(a);
			}
		}
		
	}
}

