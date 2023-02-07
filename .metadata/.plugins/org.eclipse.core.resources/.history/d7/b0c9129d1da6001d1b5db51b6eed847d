package module5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TrancetionDemo {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = ConnectionUtil.getConnectionToBanana();
			String sql="insert into [user_table](userName,pwd) "
					+ "values (?,?)";
			String sql2="insert into [user_table](id,userName,pwd) "
					+ "values (?,?,?)";
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"user01");
			pstmt.setString(2, "password01");
			pstmt.executeUpdate();
			pstmt.setString(1, "user02");
			pstmt.setString(2, "password02");
			pstmt.executeUpdate();
			pstmt.setString(1, null);
			pstmt.setString(2, null);
			pstmt.executeUpdate();
			pstmt.setInt(1, 1);
			pstmt.setInt(2, 10);
			pstmt.executeUpdate();
			
//			pstmt = conn.prepareStatement(sql2);
//			pstmt.setInt(1, 1);
//			pstmt.setString(2, "A");
//			pstmt.setString(3, "A");
//			pstmt.executeUpdate();
			conn.commit();
			System.out.println("OK");
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
				System.out.println("NG");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		try {
			conn.close();
			System.out.println("CLOSE");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
