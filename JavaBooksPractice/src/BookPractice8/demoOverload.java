package BookPractice8;

public class demoOverload {
	void show(char ch) { // ch為方法的參數
		
		System.out.println(ch);
	}

	void show(char ch, int n) { 
		System.out.print(ch);
		System.out.print(n);
		

	}

	public static void main(String[] args) {
		demoOverload obj = new demoOverload();
		obj.show('A');
		obj.show('B', 90);//overload 會根據傳入的參數決定使用哪個方法

	}

}
