package connectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTool {
	private String url = "jdbc:sqlserver://localhost:1433;databaseName=jdbcProject;encrypt=false";
	private String user = "huangyixian";
	private String pwd = "123";

	public Connection getConnection() throws SQLException { //資料庫連綫方法，以供調用
		return DriverManager.getConnection(url, user, pwd);
	}

}
