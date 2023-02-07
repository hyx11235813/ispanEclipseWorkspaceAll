package BookPractice14;

class Animal_dogg {
	protected String name;

	public void eat(String name) {
		this.name = name;
		System.out.println(name + "正在吃");
	}

	public void sleep(String name) {
		this.name = name;
		System.out.println(name + "正在睡");
	}
}

public class Dogg extends Animal_dogg {
	public void barking(String name) {
		System.out.println(name + "正在叫");
		
	}

	public static void main(String[] args) {
		Dogg dogg = new Dogg();
		String name= "Haly";
		dogg.eat(name);
		dogg.sleep(name);
		dogg.barking(name);
	}
}
