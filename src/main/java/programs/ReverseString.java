package programs;

public class ReverseString {

	public static void main(String[] args) {
		
		//method 1 convert String into char array and use for loop
		String input = "akash";
		String output = "";
		char[] chars = input.toCharArray();
		int input_length = input.length();
		
		for(int i =input_length-1; i>=0;i--) {
			System.out.print(chars[i]);
		}
		
		System.out.println("\n -------------------------------------\n");
		
		//method2 for loop with CharAt() method
		
		for(int i =input_length-1; i>=0;i--) {
			output = output + input.charAt(i);	
		}
		System.out.println(output);
		
		System.out.println("\n -------------------------------------\n");
		
		//method3 StringBuffer
		
		StringBuffer buffer = new StringBuffer(input);
		System.out.println(buffer.reverse());
		
		System.out.println("\n -------------------------------------\n");
		
		//method4 StringBuilder
		
		StringBuilder builder = new StringBuilder(input);
		System.out.println(builder.reverse());
		
	}
}
