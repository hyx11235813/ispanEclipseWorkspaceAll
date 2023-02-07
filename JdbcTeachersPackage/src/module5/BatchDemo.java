package module5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDemo {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=AdventureWorks;encrypt=false";
		String user = "huangyixian";
		String pwd = "123";
		try (Connection conn = DriverManager.getConnection(url, user, pwd)) {
			Statement stmt = conn.createStatement();// Statement專門處理batch
			stmt.addBatch("insert into mycustomers(name) values ('Bob')");
			stmt.addBatch("UPDATE[dbo].[MyCustomers] set[name]='bob rename' where id=2");
			stmt.addBatch("insert into mycustomers(Name) values ('Bob3')");
			stmt.addBatch("insert into mycustomers(Name) values ('Bob4')");
			stmt.addBatch("Delete [dbo].[MyCustomers] where id=7");

			int[] executeBatch = stmt.executeBatch(); //每筆變更都是存入整數陣列
			for (int i = 0; i < executeBatch.length; i++) {
				int j = executeBatch[i];
				System.out.println(j);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
