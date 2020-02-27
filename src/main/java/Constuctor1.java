

public class Constuctor1 {

	private String name;
	private String breed;
	private int cost;
	public Constuctor1(String name, String breed, int cost) {
		this.name = name;
		this.breed = breed;
		this.cost = cost;
	}
	public void print() {
		System.out.println(name);
		System.out.println(breed);
		System.out.println(cost);
	}
}
