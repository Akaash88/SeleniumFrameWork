import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		Set<String> values = new HashSet<>();
		values.add("Selenium");
		values.add("QTP");
		values.add("winium");
		values.add("abc");
		
		for(String e : values) {
			System.out.println(e);
		}
		System.out.println("--------------------------------------");
		ArrayList<String> array = new ArrayList<>(values); 
		System.out.println(array.get(2));
			
		

	}

}
