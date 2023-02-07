package BookPractice8;

public class SmallMath {
	int add(int x, int y) {
		int z = x + y;
		return z;
	}

	int sub(int x, int y) {
		return x - y;
	}

	int mul(int x, int y) {
		return x * y;
	}

	int div(int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {
		SmallMath sm = new SmallMath();
		System.out.println(sm.add(10, 20));
		System.out.println(sm.sub(10, 20));
		System.out.println(sm.mul(10, 20));
		System.out.println(sm.div(10, 20));
		

	}

}
