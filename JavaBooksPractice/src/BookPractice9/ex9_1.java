package BookPractice9;

public class ex9_1 {
	int x;

	void getMax(int a) {
		x = a;
	}

	void getMax(int a, int b) {
		if (a > b) {
			x = a;
		} else {
			x = b;
		}
	}

	void getMax(int a, int b, int c) {
		if (a > b && a > c) {
			x = a;
		} else if (b > a && b > c) {
			x = b;
		} else if (c > a && c > b) {
			x = c;
		}
	}

	void printInfo() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		ex9_1 ex = new ex9_1();
		ex.getMax(10);
		ex.printInfo();
		ex.getMax(5, 10);
		ex.printInfo();
		ex.getMax(5, 10, 15);
		ex.printInfo();
	}

}
