package userDao;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import connectionUtil.ConnectionTool;

public class DbToCSV {
	public static void main(String[] args) {
		ConnectionTool connectionTool = new ConnectionTool();
		try (Connection conn = connectionTool.getConnection()) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Person");// 查詢結果成結果集
			FileWriter fw = new FileWriter("C:/testPerson/Person.csv");// 創造文件並寫入
			ResultSetMetaData metadata = rs.getMetaData(); //取得結果集資料
			int columnCount=metadata.getColumnCount();//取得行數
			
			
			//schema
			for(int i=1;i<=columnCount;i++) {
				fw.append(metadata.getColumnName(i));//文件依序輸入schema名稱
				if(i<columnCount) {
					fw.append(",");//因爲是csv文件，所以中間插入逗號
				}
			}fw.append("\n");  
			
			//instance
			while(rs.next()) {
				for(int i=1;i<=columnCount;i++) {
					fw.append(rs.getString(i)); //資料進fw
					if(i<=columnCount) {
						fw.append(",");
					}
				}
				fw.append("\n");
			}System.out.println("Done!");
			
			fw.flush();//立即寫入硬碟
			fw.close();
			
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
