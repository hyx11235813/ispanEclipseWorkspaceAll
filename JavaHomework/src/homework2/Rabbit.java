package homework2;

public class Rabbit {

	public static void main(String[] args) {
		int x = 1;
		for (;;) {
			if (x % 3 == 1 & x % 5 == 3 & x % 7 == 2) {
				System.out.println(x);//只要滿足條件就印出來
				break;//滿足條件後就結束回圈
			}
			x++;  //每進行一次囘圈x就加1
		}
	}
}