package BookPractice8;

public class ex8_7 {
	String scholl = "明志科大";
	String job = "老師";

	void work() {
		System.out.println("教書");
	}

	public static void main(String[] args) {
		String course = "計算機概論";
		ex8_7 ex = new ex8_7();
		System.out.println(ex.scholl );
		System.out.println(ex.job );
		ex.work();
		System.out.println(course );
	}

}
