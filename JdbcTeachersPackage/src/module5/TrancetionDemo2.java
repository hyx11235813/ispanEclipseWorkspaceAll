package module5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class TrancetionDemo2 {

	public static void main(String[] args) {
		String url="jdbc:sqlserver://localhost:1433;databasename=northwind;encrypt=false";
		String user="sa";
		String pwd="212112";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, pwd);
			conn.setAutoCommit(false);
			String str = JOptionPane.showInputDialog("輸入轉帳金額");
			Integer money = Integer.valueOf(str);

			String selectmoneyA="select mymoney from userMoneyTable where myUser='A'";
			PreparedStatement pstmt1 = conn.prepareStatement(selectmoneyA);
			ResultSet rs = pstmt1.executeQuery();
			rs.next();
			int aMoney = rs.getInt(1);
			System.out.println("OK-29");
			
			String sql="update userMoneyTable set myMoney=? where myUser=?";
			PreparedStatement pstmt2 = conn.prepareStatement(sql);
			pstmt2.setInt(1, aMoney-money);
			pstmt2.setString(2,"A");
			pstmt2.executeUpdate();
			System.out.println("OK-36");
			
			String selectmoneyB="select mymoney from userMoneyTable where myUser='B'";
			PreparedStatement pstmt3 = conn.prepareStatement(selectmoneyB);
			ResultSet rs2 = pstmt3.executeQuery();
			rs2.next();
			int bMoney = rs2.getInt(1);
			System.out.println("OK-43");
			if(bMoney+money>800) throw new SQLException("數額超出");
			pstmt2.setInt(1, bMoney+money);
			pstmt2.setString(2,"B");
			pstmt2.executeUpdate();
			
			System.out.println("OK-49");
			conn.commit();
					
			
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			try {
				conn.setAutoCommit(true);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
