
 class Inheritance_Parent {

	int i =9;
	public void display() {
		System.out.println("this is parent display");
	}
}

class Inheritance_child extends Inheritance_Parent {
	int i = 10;
	public void disp1() {
		System.out.println(i);
	}
	public void dispaly() {
		super.display();
	}
	
	
}
class Inheritance_child2 extends Inheritance_Parent {
	int i=10;
	public void disp2() {
		System.out.println(super.i);
	}
	public void multiLvl() {
		System.out.println("this is multiLevel");
	}
	public void display() {
		System.out.println("this is child display");
	}
	
}
class Inheritance_child3 extends Inheritance_child2 {
	public void disp3() {
		System.out.println(i);
	}
}

public class Inheritance{
	public static void main(String[] args) {
		Inheritance_child obj = new Inheritance_child();
		Inheritance_child2 obj2 = new Inheritance_child2();
		Inheritance_child3 obj3 = new Inheritance_child3();
		obj.disp1();
		obj2.disp2();
		obj3.disp3();
		obj3.multiLvl();
		obj.dispaly();
		obj2.display();
	}
}