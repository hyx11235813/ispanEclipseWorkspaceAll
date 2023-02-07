package BookPractice14;

public class Animal {
	protected String name; // protected子類別才能用
	protected String id;
	protected int age;

	public void eat() {
		System.out.println(name + "編號" + id + "今年" + age + "歲" + "正在吃");
	}

	public void sleep() {

		System.out.println(name + "編號" + id + "今年" + age + "歲" + "正在睡");
	}
}

class Dog extends Animal {
	Dog(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public void barking() {

		{
			System.out.println(name + "正在叫");
		}

		// System.out.println(name + "編號" + id + "今年" + age + "嵗" + "正在叫");
	}
}

class Bird extends Animal {
	Bird(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public void flying() {

		{
			System.out.println(name + "正在飛");
		}

	}
}
