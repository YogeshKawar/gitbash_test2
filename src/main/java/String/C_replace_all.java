package String;

public class C_replace_all {
	public static void main(String[] args) {
		String name= "SUR@AJ1 ";
		String rev=name.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(rev);
	}

}
