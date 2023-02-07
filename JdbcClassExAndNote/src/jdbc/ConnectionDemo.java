package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {
	//功能：建立數據庫連綫，幫我們傳遞sql語句給資料庫執行
	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(//連接到SQL Server數據庫
				"jdbc:sqlserver://localhost:1433;databaseName=Northwind;encrypt=false", "banana", "123")) {
			System.out.println("ok");
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
