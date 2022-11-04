package String;

public class K_divide_String_2 {
	public static void main(String[] args) {
		String str = "aaabbbccc";
		int length = str.length();
		
		int n=3;
		int chars = length/n;
		int temp=0;
		
		String elements []= new String[n];
		
		if(length%n!=0) {
			System.out.println("Entered string is not perfectly dividible in "+n);
		}
		else {
			for (int i=0 ; i<length;i=i+chars) {
				String parts = str.substring(i, i+chars);
				elements[temp]=parts;
				temp++;
				}
			System.out.println("Entered string is perfectly divisible in "+n+ "parts");
			for(String a:elements) {
				System.out.println(a);
			}
			}
		}
	}


