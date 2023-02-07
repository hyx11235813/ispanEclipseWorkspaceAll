package homework5;

public class Shape_main {

	public static void main(String[] args) {
		Circle circle = new Circle(10);
		System.out.println("面積：" + circle.computeArea());
		System.out.println("周長：" + circle.computeCircumference());
		Rectangle rectangle = new Rectangle(10, 10);
		System.out.println("面積：" + rectangle.computeArea());
		System.out.println("周長：" + rectangle.computeCircumference());

	}

}
