package programs;

public class Swap2Num {

	public static void main(String[] args) {
	
		int first  = 10;
		int second = 20;
		
		System.out.println("Before Swap in First value: "+first);
		System.out.println("Before Swap in Second value "+second);
		
		int temp = first; //a = a+b;
		first= second;    //b = a-b;
		second = temp;    //a = a-b;
		
		System.out.println("----------------------------------------");
		
		System.out.println("After Swap in First value: "+first);
		System.out.println("After Swap in Second value "+second);

	}

}
