package module5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDemo {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false";
		String user = "sa";
		String pwd = "212112";
		try (Connection conn = DriverManager.getConnection(url, user, pwd)){
			Statement stmt = conn.createStatement();
			stmt.addBatch("insert into mycustomers(name) values ('Bob5')");
			stmt.addBatch("UPDATE [dbo].[MyCustomers] SET [Name] = 'Bob6' WHERE id=2");
			stmt.addBatch("UPDATE [dbo].[MyCustomers] SET [Name] = 'Bob7' WHERE id=3");
			stmt.addBatch("insert into mycustomers(name) values ('Bob8')");
			stmt.addBatch("insert into mycustomers(name) values ('Bob9')");
			stmt.addBatch("Delete [dbo].[MyCustomers]  WHERE id=4");
			int[] executeBatch = stmt.executeBatch();
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
