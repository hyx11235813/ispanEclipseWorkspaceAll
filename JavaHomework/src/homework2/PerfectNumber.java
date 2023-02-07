package homework2;

public class PerfectNumber {

	public static void main(String[] args) {
		int factor=0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j < i; j++) {//j要小於i，才不會把i本身算進去
				if(i%j==0) {
					factor+=j;
				}
			}
			if (factor == i) { //判斷所有的因數相加后是否等於自己，是的話就是完美數
				System.out.println(factor);
			}factor=0; //這邊要歸零重新計算，否則會一直纍加
		}

	}
}
