package BookPractice14;
//多層次繼承

public class Animal_multi {
	protected String name;
	protected String id;

	Animal_multi(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public void eat() {
		System.out.println("編號" + id + "：" + name + "正在吃食物");
	}

}

class Mammal extends Animal_multi {
	protected String favorite_food;

	Mammal(String id, String name, String favorite_food) { // fvrte_fod
		super(name, id); // 父類方法

		this.favorite_food = favorite_food;

	}

	public void favoriteFood() {

		System.out.println("編號" + id + "：" + name + "喜歡吃" + favorite_food);
	}

}

class Cat extends Mammal {
	Cat(String id, String name, String favorite_food) {
		super(id, name, favorite_food);

	}

	public void meow() {

		System.out.println("編號" + id + "：" + name + "正在叫");
	}

}
