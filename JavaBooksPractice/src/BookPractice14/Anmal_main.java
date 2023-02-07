package BookPractice14;

public class Anmal_main {

	public static void main(String[] args) {
		Dog dog = new Dog("Haly", "001", 5);
		dog.eat();
		dog.sleep();
		dog.barking();
		Bird bird = new Bird("Cici", "002", 3);
		bird.eat();
		bird.sleep();
		bird.flying();
	}

}
