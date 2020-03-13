package programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num;
		int revNum = 0;
		int digit;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		while(num != 0) {
			digit = num % 10;
			revNum = revNum*10 + digit;
			num = num / 10;
		}
			System.out.print(revNum);
		}
	}

