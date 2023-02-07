package module5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection getConnectionToBanana() throws SQLException {
		Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=mydb;encrypt=false", "huangyixian", "123");
		
		return conn;
	}

}
