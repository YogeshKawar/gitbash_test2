package String_pracatice;

public class G_swap_the_string {
	public static void main(String[] args) {
		String firstName = "SURAJ" ;
		String lastName = "JADHAV";
		System.out.println("First Name before swapping -: "+firstName+"\n"+"Last Name before Swaping -: "+lastName+"\n");
		firstName = firstName+lastName;
		
		lastName = firstName.substring(0,(firstName.length()-lastName.length()));
		
		firstName =firstName.substring(lastName.length());
		
		System.out.println("First Name after swapping -: "+firstName+"\n"+"Last Name after Swaping -: "+lastName+"\n");
	}
	

}
