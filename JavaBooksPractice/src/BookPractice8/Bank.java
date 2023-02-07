package BookPractice8;

public class Bank {
	int account;
	int balance;
	int withdraw;
	int save;

	Boolean save(int save) {
		if (save > 0) {
			balance += save;
			return true;
		} else {
			return false;
		}
	}

	Boolean withdraw_money(int withdraw) {
		if (withdraw <= balance) {
			balance -= withdraw;
			return true;

		} else {
			return false;
		}

	}

	void printInfo() {
		System.out.printf("賬戶：%d,餘額 %d\n", account, balance);
	}

	public static void main(String[] args) {
		Bank Bank = new Bank();
		Bank.account = 10000001;
		Bank.balance = 0;
		Bank.withdraw = 0;
		int save=1000;
		int withdraw1=90;
		int withdraw2=20;
		Bank.printInfo();
		System.out.println("存款" + (Bank.save(save) ? "成功" : "失敗"));// 100>0=true
		Bank.printInfo();
		System.out.println("提款" + (Bank.withdraw_money( withdraw1) ? "成功" : "失敗"));
		Bank.printInfo();
		System.out.println("提款" + (Bank.withdraw_money( withdraw2) ? "成功" : "失敗"));
		Bank.printInfo();
	}

}
