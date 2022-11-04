package String;

public class total_char_count {
public static void main(String[] args) {
	String name ="Suraj Jadhav";
	int count=0;
	for (int i=name.length()-1 ; i>=0 ; i--) {
		if (name.charAt(i)!=' ') {
		count++;
	}
	
}
	System.out.println(count);	
}
}