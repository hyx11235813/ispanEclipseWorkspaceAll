package BookPractice9;

public class Bank {
	private String name;
	private int balance;
	private int rate = 30;
	private double service_charge = 0.01;

	private Bank(String name) {
		this.name = name;
		this.balance = 0;
	}

	public void save(int money) {
		this.balance += money;
	}

	public void withdraw(int money) {
		this.balance -= money;
	}

	public double usa_to_taiwan(int usaD) {// 美兌臺
		if (this.balance >= 10000) {
			this.service_charge = 0.008;

		}
		return cal_rate(usaD); // 代表呼叫 cal_rate這個方法

	}

	public double tatiwan_to_usa(int twd) {// 台兌美
		if (this.balance >= 10000) {
			this.service_charge = 0.008;

		}
		return cal_rate1(twd);
	}

	private double cal_rate(int usaD) {// 美兌台算法
		double result;
		result = usaD * rate * (1 - service_charge);
		return result; // result會回傳結果到呼叫函式的地方，也就是usa_to_taiwan
	}

	private double cal_rate1(int twd) {// 台兌美算法
		double result;
		result = twd / rate * (1 - service_charge);
		return result;
	}

	public void get_balance() {
		System.out.println("用戶" + name + " " + "餘額" + balance + "元");
	}

	public static void main(String[] args) {
		Bank bank = new Bank("huang");
		int usdallor = 50;
		int twd = 30000;
		bank.save(15000);
		bank.get_balance();
		System.out.println(usdallor + "美元可以兌換" + bank.usa_to_taiwan(usdallor) + "臺幣");
		System.out.println(twd + "臺幣可以兌換" + bank.tatiwan_to_usa(twd) + "美金");
	}

}
