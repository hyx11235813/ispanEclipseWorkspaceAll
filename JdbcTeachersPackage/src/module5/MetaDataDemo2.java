package module5;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Iterator;

public class MetaDataDemo2 {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=Northwind;encrypt=false";
		String user = "huangyixian";
		String pwd = "123";

		try (Connection conn = DriverManager.getConnection(url, user, pwd)) {
			String sql = "Select* from Employees";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();  //18個schema
			ResultSetMetaData metaData = rs.getMetaData(); //rs.getMetaData() 方法，可以獲得這個元資料物件。 之後存入metaData
			System.out.println(metaData.getColumnCount());// 印出欄位總數
			rs.next();
			for (int i = 1; i <= metaData.getColumnCount(); i++) { //run每一行
				System.out.println(metaData.getColumnName(i) + ":" + rs.getString(i));// 取得欄位名稱并且取得哪一行的string資料
				System.out.println(metaData.getColumnLabel(i) + ":" + rs.getString(i));// select 的as名稱
				System.out.println(metaData.getColumnTypeName(i));
				System.out.println(metaData.getColumnDisplaySize(i));
				System.out.println(metaData.isNullable(i));

			}
//			System.out.println(metaData.getColumnName(2));//欄位名稱
//			System.out.println(metaData.getColumnLabel(2));//欄位別名
//			System.out.println(metaData.getColumnTypeName(2));//欄位資料型別
//			System.out.println(metaData.getColumnDisplaySize(2));//欄位有效長度
		}

		catch (SQLException e) { //異常處理
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
			//select *from sys.messages where language_id=1028//可以到sql查詢中文的所有錯誤資訊

		}
	}

}
