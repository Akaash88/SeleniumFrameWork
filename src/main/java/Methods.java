
public class Methods {

	public static void main(String[] args) {
	Methods obj = new Methods();
	obj.method();
	obj.method("this");
	obj.method(2,"method");
	
	}
	void method() {
		System.out.println("default");
	}
	void  method(String a ) {
		System.out.println(a+" is method overloading");
	}
	int method(int a,String b) {
		System.out.println("this is "+a+"nd "+ b+" overloading");
		return a;
	}

	
}
