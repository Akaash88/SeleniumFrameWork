package programs;

public class Remove_WhiteSpace {

	public static void main(String[] args) {
		String str = "I am Alpha and Omega";

		//method 1 convert String into char array and use for loop
		char[] chars = str.toCharArray();
		String str1= "";

		for(int i=0; i<chars.length;i++) {
			if(chars[i]!=' ') {
				str1 = str1+chars[i];
			}
		}
		System.out.println(str1);

		System.out.println("\n----------------------------------------\n");

		//method2 for loop with CharAt() method
		String str2= "";

		for(int i=0; i<chars.length;i++) {
			if(chars[i]!=' ') {
				str2 = str2+str.charAt(i);
			}
		}
		System.out.println(str1);

		System.out.println("\n----------------------------------------\n");

		//method3 Replace method
		String str3 = str.replace(" ", "");
		System.out.println(str3);
	}
}
