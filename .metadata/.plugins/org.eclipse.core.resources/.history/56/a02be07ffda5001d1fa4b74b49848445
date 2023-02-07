package module5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class BatchDemo2 {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false";
		String user = "sa";
		String pwd = "212112";
		try (Connection conn = DriverManager.getConnection(url, user, pwd)) {
			String sql = "insert into mycustomers(name) values (?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			String name = "";
			while ((name = JOptionPane.showInputDialog("name")) != null) {
				pstmt.setString(1, name);
				pstmt.addBatch();
			}
			pstmt.executeBatch();
			System.out.println("OK");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
