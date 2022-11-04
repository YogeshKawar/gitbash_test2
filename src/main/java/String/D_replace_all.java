package String;

public class D_replace_all {
	public static void main(String[] args) {
		String old = "SUR@AJ12 ";
		String rev=old.replaceAll("[^a-zA-Z]", "");
		System.out.println(rev);
	}

}
