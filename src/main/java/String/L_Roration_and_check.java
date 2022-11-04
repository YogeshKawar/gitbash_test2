package String;

public class L_Roration_and_check {
	public static void main(String[] args) {
		String s1 = "suraj";
		String s2="rajsu";
		
		int s1Length=s1.length();
		int s2Length=s2.length();
		
		//System.out.println(s1concate);
		
		if(s1Length!=s2Length) {
			System.out.println("String can not be rotarable");
		}
		else {
			
			String s3=s1.concat(s1);
			if (s3.indexOf(s2) != -1) {
				System.out.println("String is rotarable");
				int a = s3.indexOf(s2);
				
			}
			else {
				System.out.println("No it's not rotateable");
			}
		}
		
	}

}
