package jdbc2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import connectionUtil.ConnectionFactory;


public class ConnectionFactoryTest3 {
	public static void main(String[] args) {
//PreparedStatement,爲了安全性，必須用這個方法
		ConnectionFactory connF = new ConnectionFactory();
		String lastname = JOptionPane.showInputDialog("Lastname");
		String firstname = JOptionPane.showInputDialog("Firstname");
		String sql = "SELECT [EmployeeID],[Lastname],[Firstname]"+"FROM [dbo].[Employees] where Lastname= ?  and Firstname = ?";//SSMS直接建立
		System.out.println(sql);//?只能用在where的後面
		/*******/
		try (Connection conn = connF.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);//建立的時候把sql語句放進去
			pstmt.setString(1,lastname);//set
			pstmt.setString(2,firstname);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.printf("%3S  %10S  %10S %n",rs.getString(1),rs.getString(2), rs.getString(3));
				
			}
			System.out.println("OK");
		}
			catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
