package homework5;

public interface Shape {
	public double computeArea(); // 算面積

	public double computeCircumference();// 算周長

}

class Circle implements Shape {
	private double r;

	Circle(double r) {
		this.r = r;
	}

	public double computeArea() {
		return r * r * Math.PI;
	}

	public double computeCircumference() {
		return r * 2 * Math.PI;
	}
}

class Rectangle implements Shape {
	private double height, width;

	Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	public double computeArea() {
		return height * width;
	}

	public double computeCircumference() {
		return (height * width) * 2;
	}

}


