package homework5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeFile {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("c:\\EmployeeFile\\employee.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] tokens = line.split(",");
				String type = tokens[0];
				String name = tokens[1];
				String gender = tokens[2];
				String birthdate = tokens[3];
				String phone = tokens[4];
				String email = tokens[5];

				Employee employee = null;
				switch (type) {
				case "General":
					employee = new General(name, gender, birthdate, phone, email);
					break;
				case "Supervisor":
					employee = new Supervisor(name, gender, birthdate, phone, email);
					break;
				case "Salesperson":
					employee = new Salesperson(name, gender, birthdate, phone, email);
					break;
				case "TempWorker":
					employee = new TempWorker(name, gender, birthdate, phone, email);
					break;
				}

				employees.add(employee);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (Employee employee : employees) {
			employee.printInfo();
		}
	}
}
