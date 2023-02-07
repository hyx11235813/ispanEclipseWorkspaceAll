package module5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBtoFile {

	public static void main(String[] args) {
		String url="jdbc:sqlserver://localhost:1433;databasename=Northwind;encrypt=false";
		String user="sa";
		String pwd="212112";
		try (Connection conn = DriverManager.getConnection(url, user, pwd)){
			String sql="select fileName,MyFile from [fileTable] where filename='aaa.jpg'";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1));
				FileOutputStream fos=new FileOutputStream("c://java//1234.jpg");
				InputStream binaryStream = rs.getBinaryStream(2);
				int data=0;
				while((data=binaryStream.read())!=-1) {
					fos.write(data);
				}
				fos.flush();//沖出=>記憶體裡面的資料沖出到檔案中
				fos.close();
				binaryStream.close();
				System.out.println("OK");
					
			}		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
