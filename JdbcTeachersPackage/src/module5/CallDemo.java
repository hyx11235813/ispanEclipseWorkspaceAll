package module5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallDemo {

	public static void main(String[] args) {
		String url="jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false";
		String user="huangyixian";
		String pwd="123";
		//透過id找到customerid跟orderdate
		try (Connection conn = DriverManager.getConnection(url, user, pwd)){
			CallableStatement prepareCall = conn.prepareCall("{call get_customerid_and_order_date(?,?,?)}");//sql裏面設定的procedure
			prepareCall.setInt(1, 10442); //給id
			prepareCall.registerOutParameter(2,java.sql.Types.NCHAR); //給予相應的資料類型
			prepareCall.registerOutParameter(3,java.sql.Types.DATE);
			prepareCall.execute();
			System.out.println(prepareCall.getString(2));
			System.out.println(prepareCall.getString(3));
//			ResultSet rs = prepareCall.executeQuery();
//			while(rs.next()) {
//				System.out.println(rs.getString(1));
//				System.out.println(rs.getString(2));
//			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
