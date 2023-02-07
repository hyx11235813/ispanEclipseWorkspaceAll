package BookPractice14;

class MyMath {
	protected int volume(int r, int h) {
		return r * r * h;
	}
}

class Circle {

	protected MyMath obj;

	public double getArea(int r, int h) {
		obj = new MyMath();
		int square = obj.volume(r, h); // Mymath的方法，r*r*h//volume
		return Math.PI * square; // 回傳給getArea

	}

}

public class ch14_16_has_a {
	public static void main(String[] args) {
		double area;
		Circle circle = new Circle();
		area = circle.getArea(10, 5);
		System.out.printf("圓面積是：%6.2f\n", area);
	}

}
