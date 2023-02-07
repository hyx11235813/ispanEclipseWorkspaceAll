package module5;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MetaDataDemo {

	public static void main(String[] args) {
		String url="jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false";
		String user="sa";
		String pwd="212112";
		
		try (Connection conn = DriverManager.getConnection(url, user, pwd)){
			DatabaseMetaData metaData = conn.getMetaData();
			System.out.println(metaData.getDatabaseProductName());
			System.out.println(metaData.getDatabaseProductVersion());
			System.out.println(metaData.getDriverName());
			System.out.println(metaData.getDriverVersion());
			System.out.println(metaData.getUserName());
			System.out.println(metaData.getURL());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
