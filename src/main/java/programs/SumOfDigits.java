package programs;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
	int num,reminder,sum = 0;
	System.out.println("Enter the input: ");
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	while (num>0) {
		reminder = num % 10;
		sum = sum + reminder;
		num = num/10;
	}
	System.out.println("The sum of all digits is: "+sum);
	sc.close();
}
}
