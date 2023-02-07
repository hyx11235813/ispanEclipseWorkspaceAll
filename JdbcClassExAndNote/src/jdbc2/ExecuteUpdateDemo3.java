package jdbc2;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectionUtil.ConnectionFactory;

public class ExecuteUpdateDemo3 {
	public static void main(String[] args) {
		String sql = "SELECT *" + " FROM [Northwind].[dbo].[Employees]";// SSMS直接建立
		ConnectionFactory connectionFactory = new ConnectionFactory();// 創建連線
		try (Connection conn = connectionFactory.getConnection()) { // 取得連線
			Statement stmt = conn.createStatement();// 建立敘述，向數據庫發送 SQL語句
			// Statement是Java JDBC API的一個界面，它是用來執行SQL語句的。
			boolean execute = stmt.execute(sql);// 回傳true or false,true代表select到東西
			System.out.print("是否有ResultSet:" + execute);
			ResultSet rs = stmt.getResultSet();//取得結果集(很多比資料）
			if (execute) {
				while (rs.next()) {
					System.out.println(rs.getString(3));//第三個column
				}
			} else {
				int updateCount = stmt.getUpdateCount();// 如果沒有找到Firstname的話，會直接把把我們查詢到的Firstname Nancy ...
														// Angel直接放入Errrr table裡面
				System.out.println("新增了" + updateCount + "筆");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
