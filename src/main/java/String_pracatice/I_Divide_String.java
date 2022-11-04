package String_pracatice;

public class I_Divide_String {
	public static void main(String[] args) {
		String a = "aaaabbbbcccc";
		System.out.println("Enter String -: "+ a+"\n");
		int temp =0;
		int len=a.length();
		int n =3 ;
		int chars =len/n;
		
		String[] store = new String[n];
		
		if (len%n!=0) {
			System.out.println("String is not perfectly divisible by "+n+"\n");
		}
		else {
			
		System.out.println("String is perfectly divisible by "+n);
		for (int i=0;i<=a.length()-1;i=i+chars) {
			String parts = a.substring(i, i+chars);
			store[temp]=parts;
			temp++;
		}
		System.out.println("String after divided by "+n+"-:");
		for (String element:store) {
			System.out.println(element);
		}
	}
	}
}
		
