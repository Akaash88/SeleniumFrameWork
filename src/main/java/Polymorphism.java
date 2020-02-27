

class Test {

	public void disp() {
		System.out.println("parent");
	}

}
class Test2 extends Test{
	public void disp() {
		System.out.println("child");
	}
	public void dis2() {
		System.out.println(" test2 display2");
	}

}

class Test3 extends Test{
	public void disp2() {
		System.out.println("test3 display3");
	}
}


class Whole_set {
	public void wholeTest(Test ref) {
		ref.disp();
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		/*test2 obj = new test2();
			Test ref;
			ref = obj;
			ref.disp();*/
		Test obj = new Test2();
		obj.disp();
		((Test2)obj).dis2();  //type casting
	}
}
