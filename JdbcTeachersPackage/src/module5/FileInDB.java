package module5;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FileInDB {

	public static void main(String[] args) {
		String url="jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false";
		String user="huangyixian";
		String pwd="123";
		//圖片寫進資料庫
		try(Connection conn = DriverManager.getConnection(url,user,pwd)) {
			String sql="insert into fileTable(fileName,MyFile) values (?,?)";
			FileInputStream fis=new FileInputStream("C:/java/aaa.jpg");//要放入資料庫的檔案位置
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "aaa.jpg");//給要放入資料庫的照片命名
			pstmt.setBinaryStream(2, fis);
			int count = pstmt.executeUpdate();
			System.out.println("OK:"+count);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
