package homework2;

public class Interest {
	public static void main(String[] args) {
		double money_qian = 100000;
		double money_hao = 100000;
		int year = 0;
		while (money_hao <= money_qian) {
			money_qian += 100000 * 0.1; // 單利公式 本金+(本金×利率)
			money_hao *= 1.05;// 複利 本金×(1+年利率)
			year++;
		}
		System.out.println(year + "年後郝超過錢");
		System.out.println("錢 " + money_qian);
		System.out.println("郝 " + money_hao);
	}
}
