package String;

public class S_First_Letter_Capital {
	public static void main(String[] args) {
		String [] name = "suraj jadhav".split(" ");
		String Capitlizeword="";
		
		for(String w : name) {
			String first = w.substring(0, 1);
			String end = w.substring(1);
			Capitlizeword= Capitlizeword+first.toUpperCase()+end+" ";
		}
		System.out.println(Capitlizeword);
	}

}
