import java.util.Scanner;

public class Guess {
	public static void main(String[] args) {
		int guessernumber=guess();
		int playernumber=player();
		if(guessernumber==playernumber)
		{
			System.out.println("player has won");
		}
		else
		{
			System.out.println("player has lost");
		}
	}
	
	static  int guess() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number for guessing: ");
		int guess = sc.nextInt();
		sc.close();
		return guess;
		
	}

	static int player() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number guessed by players is ");
		int playerNum = sc.nextInt();
		System.out.println("enter the player name: ");
		String playerName = sc.next();
		System.out.println("number selectd by " +playerName+ " is "+playerNum);
		sc.close();
		return playerNum;
	}
	

	}	