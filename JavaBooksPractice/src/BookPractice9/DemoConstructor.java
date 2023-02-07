package BookPractice9;

public class DemoConstructor {
	int age;
	String name;

	DemoConstructor() {  //預設建構子

	}

	DemoConstructor(String name, int age) {//帶參數的建構子
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		DemoConstructor dc = new DemoConstructor("John", 20);  //初始化了姓名為John和年齡為20
		System.out.println(dc.name + dc.age);
		
		DemoConstructor dc1 = new DemoConstructor();
		dc1.age = 22;
		dc1.name = "Peter";
		System.out.print(dc1.name + dc1.age);
	}

}
