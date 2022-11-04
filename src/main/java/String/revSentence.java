package String;

public class revSentence {
	public static void main(String[] args) {
		String[] name = "I am from Thane".split(" ");
		//System.out.println(name[2]);
		
		String finalAns="";
		
		for (int i=name.length-1;i>=0;i--) {
			finalAns=finalAns+name[i] +" ";
			
		}
		System.out.println(finalAns);
	}

}
