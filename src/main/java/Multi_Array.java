import java.util.Scanner;

public class Multi_Array {

	public static void main(String[] args) {
		int[][] a = new int[3][4];
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=a.length-1;i++) {
			for(int j=1;j<=a[i].length-1;j++) {
				System.out.println("Enter the student class of "+i+ " marks "+j);
				a[i][j]= sc.nextInt();
				
			
			}
		}
	
		for(int i=1;i<=a.length-1;i++) {
			System.out.println("class "+i);
			for(int j=1;j<=a[i].length-1;j++) {
				
				System.out.print(a[i][j]+"\n");
			}
		
			System.out.println("");
	}
		sc.close();
}
}