package homework1;

public class Refund2 {

	public static void main(String[] args) {
		int paid = 1000;// 付的錢
		int payable = 132;// 該付的錢
		int money = paid - payable;// 找的錢
		int[] value = { 1000, 500, 100, 50, 10, 5, 1 };// 幣值
		int[] count = new int[value.length];// 宣告count複製並取得value的長度。count[0]=1000

		if (paid < payable) {
			System.out.println("金額不足");
		}
		if (paid == payable) {
			System.out.println("不需找錢");
		}
		if (paid > payable) {
			for (int i = 0; i < value.length; i++) {
				while (money >= value[i]) {
					money = money - value[i];
					count[i]++;

				}
				if (count[i] != 0) {
					System.out.println(count[i] + "張" + value[i] + "元");
				}
			}

		}
	}
}
