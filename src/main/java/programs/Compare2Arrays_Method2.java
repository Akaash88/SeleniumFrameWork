package programs;

public class Compare2Arrays_Method2 {

	public static void main(String[] args) {
		//String a[] = {"ant","bat","cat"};
		//String b[] = {"ant","bat","cat"};

		Integer a[]= {5,4,7};
		Integer b[]= {5,4,7};
		if(arrayEqualityCheck(a, b)) {
			System.out.println("Both arrays are equal");
		}
		else {
			System.out.println("Both Arrays are not equal");
		}
	}
	static boolean arrayEqualityCheck(Object a[], Object b[]) {
		if(a.length != b.length) {
			return false;
		}
		else {
			for(int i = 0;i<a.length;i++)
			{
				if(a[i] != b[i]) {
					return false;
				}
			}
			return true;
		}
	}
}
