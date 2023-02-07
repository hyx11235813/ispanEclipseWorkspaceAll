package BookPractice8;

public class Dog {
	String name;
	String color;
	int age;

	void barking() {
		System.out.print("我的狗在叫\n");
	}

	void eating() {
		System.out.print("我的狗在吃");
	}

	public static void main(String[] args) {
		Dog Dog = new Dog();
		Dog.name="Lily";
		Dog.color="White";
		Dog.age=5;
		System.out.println("name="+Dog.name);
		System.out.println("color="+Dog.color);
		System.out.println("age="+Dog.age);
		Dog.barking();
		Dog.eating();

	}

}
