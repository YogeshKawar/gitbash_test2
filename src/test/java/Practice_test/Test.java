/*An Armstrong Number is a special positive number whose sum of cubes of its digit is equal 
 * to that number. 
 * The number 154 is an Armstrong number because if we perform the sum of cubes of each digit, 
 * it will result in the same number.

= 153

= (1)^3+(5)^3+(3)^3
= 1+125+27

= 153*/
package Practice_test;

public class Test {
public static void main(String[] args) {
	int sumOfCube= 0;
	int a,temp;
	int number = 153;
	temp=number;
	
	while(number>0) 
	{
		a=number%10;//Getting last digit
		number=number/10;//removing last digit from number
		sumOfCube = sumOfCube+(a*a*a);//Calculating sum of digits
	}
	if (temp==sumOfCube) 
	{
		System.out.println(temp+" Is armstrong number");
	}
	else
	{
		System.out.println(temp+" Is not armstrong number");
	}
}
}
