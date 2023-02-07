package homework5;

class Employee {
	protected String name;
	protected String gender;
	protected String hiredate;
	protected String phone;
	protected String email;

	public Employee(String name, String gender, String hiredate, String phone, String email) {
		this.name = name;
		this.gender = gender;
		this.hiredate = hiredate;
		this.phone = phone;
		this.email = email;
	}

	public void printInfo() {
		// TODO Auto-generated method stub
		
	}

}

class Permanent extends Employee {
	final int luncheon_allowance = 2400;


	public Permanent(String name, String gender, String hiredate, String phone, String email) {
		super(name, gender, hiredate, phone, email);
		

	}

}

class General extends Permanent {
	int baseSalary;

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {// set
		this.baseSalary = baseSalary;
	}

	public General(String name, String gender, String hiredate, String phone, String email) {
		super(name, gender, hiredate, phone, email);// 這是方法不是變數，所以名字可以跟父類的建構子不同，系統會根據子類別建構子中的super()參數來尋找父類別中符合參數類型和數量的建構子

	}

	public int Salary() {
		return baseSalary + luncheon_allowance;
	}

	public void printInfo() {
		System.out.println("姓名:" + name + " 性別:" + gender + " 到職日:" + hiredate + " 電話:" + phone + " email:" + email
				+ " 午餐津貼：" + luncheon_allowance + " 本薪:" + baseSalary + " 總薪資:" + Salary());

	}

}

class Supervisor extends General {
	int bonus;
	final int tran_allowance = 3000;
	int baseSalary;

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Supervisor(String name, String gender, String hiredate, String phone, String email
			) {
		super(name, gender, hiredate, phone, email);
	

	}

	public int Salary() {

		return baseSalary + luncheon_allowance + bonus + tran_allowance;
	}

	public void printInfo() {
		System.out.println("姓名:" + name + " 性別:" + gender + " 到職日:" + hiredate + " 電話:" + phone + " email:" + email
				+ " 午餐津貼：" + luncheon_allowance + " 交通津貼：" + tran_allowance + " 績效：" + bonus + " 本薪:" + baseSalary
				+ " 總薪資：" + Salary());

	}

}

class Salesperson extends Permanent {
	int sales_bonus;
	int baseSalary;

	public int getSales_bonus() {
		return sales_bonus;
	}

	public void setSales_bonus(int sales_bonus) {
		this.sales_bonus = sales_bonus;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Salesperson(String name, String gender, String hiredate, String phone, String email
			) {
		super(name, gender, hiredate, phone, email);
		

	}

	public int Salary() {

		return baseSalary + luncheon_allowance + sales_bonus;
	}

	public void printInfo() {
		System.out.println("姓名:" + name + " 性別:" + gender + " 到職日:" + hiredate + " 電話:" + phone + " email:" + email
				+ " 午餐津貼：" + luncheon_allowance + " 銷售獎金:" + sales_bonus + " 本薪:" + baseSalary + " 總薪資：" + Salary());

	}

}

class TempWorker extends Employee {///

	int hours;
	int hourly_wage;

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getHourly_wage() {
		return hourly_wage;
	}

	public void setHourly_wage(int hourly_wage) {
		this.hourly_wage = hourly_wage;
	}

	public TempWorker(String name, String gender, String hiredate, String phone, String email) {
		super(name, gender, hiredate, phone, email);
	}

	public int Salary() {

		return hours * hourly_wage;
	}

	public void printInfo() {
		System.out.println("姓名:" + name + " 性別:" + gender + " 到職日:" + hiredate + " 電話:" + phone + " email:" + email
				+ " 時數：" + hours + " 時薪：" + hourly_wage + " 總薪資：" + Salary());

	}

}
