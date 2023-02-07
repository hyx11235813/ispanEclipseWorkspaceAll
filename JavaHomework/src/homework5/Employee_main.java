package homework5;

public class Employee_main {

	public static void main(String[] args) {
		General general = new General("Huang", "Male", "2000-1-01", "0800123123", "ggf@gmail.com");
		general.setBaseSalary(0);// 本薪
		general.printInfo();

		Supervisor supervisor = new Supervisor("liu", "Female", "2000-2-02", "0900000000", "zxcv@gamil,com" 
				);
		supervisor.setBaseSalary(0);// 本薪
		supervisor.setBonus(0);//績效獎金
		supervisor.printInfo();
		Salesperson salesperson = new Salesperson("chen", "Male", "2002-05-01", "0988123123", "asdf@gamil.com");

		salesperson.setBaseSalary(0);// 本薪
		salesperson.setSales_bonus(0);//銷售獎金
		salesperson.printInfo();

		TempWorker tem = new TempWorker("chen", "Male", "2002-05-01", "0988123123", "asdf@gamil.com");
		tem.setHours(0);//時數
		tem.setHourly_wage(0);//時薪
		tem.printInfo();
	}

}
