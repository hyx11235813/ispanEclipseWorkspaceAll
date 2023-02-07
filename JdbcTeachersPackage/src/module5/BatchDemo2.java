package module5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class BatchDemo2 {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=AdventureWorks;encrypt=false";
		String user = "huangyixian";
		String pwd = "123";
		try (Connection conn = DriverManager.getConnection(url, user, pwd)) {
			String sql = "insert into mycustomers(name)values(?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			String name = "";
			while ((name = JOptionPane.showInputDialog("name")) != null) {//用一個輸入的界面，name=輸入的東西
				pstmt.setString(1, name);//把輸入的東西insert values
				pstmt.addBatch();
			}
			pstmt.executeBatch();
			System.out.println("ok");//結束後印出ok
			
			//第二種方法
//			pstmt.setString(1, "input2"); //在這裏填入
//			pstmt.addBatch();
//			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
