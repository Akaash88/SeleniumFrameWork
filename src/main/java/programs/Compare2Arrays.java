package programs;

import java.util.Arrays;

public class Compare2Arrays {

	public static void main(String[] args) {
		
		//method1 Using Array in-Built Class
		int a[] = {10,20,30};
		int b[] = {10,20,30};
		
		if(Arrays.equals(a, b)) {
			System.out.println("Both the Arrays are Equals");
		}
		else {
			System.out.println("both the Arrays are not Equals");
		}

	}

}
