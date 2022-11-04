package String_pracatice;

public class C_ReplaceAllSplchars {
	public static void main(String[] args) {
		String name = "SURA@J! 1 ";
		String revName = name.replaceAll("[^a-zA-Z]", "");
		System.out.println("Name before replacement of all special characters -: "+name+"\n");
		System.out.println("Name after replacement of special characters-: "+revName);
	}

}
