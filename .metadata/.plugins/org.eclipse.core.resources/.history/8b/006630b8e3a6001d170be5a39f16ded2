package userDao;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ExportToCSV {
	public static void main(String[] args) {
        try {
            // 加載 JDBC 驅動程式
            Class.forName("com.mysql.jdbc.Driver");

            // 連接資料庫
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/database_name", "username", "password");

            // 建立 Statement
            Statement stmt = con.createStatement();

            // 查詢資料
            ResultSet rs = stmt.executeQuery("SELECT * FROM table_name");

            // 建立 CSV 檔案
            FileWriter fw = new FileWriter("data.csv");//path

            // 取得資料欄的名 稱和資料表的元數據
           
            ResultSetMetaData metadata = rs.getMetaData();
            int columnCount = metadata.getColumnCount();
            
            // 寫入 CSV 檔案的標題
            for (int i = 1; i <= columnCount; i++) {
                fw.append(metadata.getColumnName(i));
                if (i < columnCount) {
                    fw.append(","); //以逗號分隔，這就是CSV文件的一種基本格式。當打開這個文件時，Excel會自動識別它是CSV文件
                }	//所以上面的程式碼意思是把schema寫入fw裏面，并且i<columnCount時在寫入的schema後面加上逗號嗎？ 最後一個schema後面就沒有逗號
            }
            fw.append("\n");  //最後寫入換行符號

            // 寫入資料
            while (rs.next()) { //結果集中還有下一行的存在，就會輸入下一行的所有資料，直到最後一行
                for (int i = 1; i <= columnCount; i++) {
                    fw.append(rs.getString(i));
                    if (i < columnCount) {
                        fw.append(",");
                    }
                }
                fw.append("\n");  
            }

            // 關閉檔案
            fw.flush();
            fw.close();

            // 關閉連接
            con.close();
        } catch (Exception e) {
        	e.printStackTrace();
        	}
        	}
        	}
