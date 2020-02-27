import java.util.Scanner;

public class Simple_Array {

	public static void main(String[] args) {
		int[] array = new int[7];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student marks: " );
		for(int i=1;i<=6;i++) {
			array[i] = sc.nextInt();
			System.out.println("subject"+i+" marks");
			System.out.println(array[i]);
			
		}
		sc.close();
	}
}
