package userDao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import connectionUtil.ConnectionTool;

public class JasonToDb {//
//	public static Connection ConnectToDB() throws Exception {// ConnectToDB()=conn
//		ConnectionTool ConnectionTool = new ConnectionTool();
//		Connection conn = ConnectionTool.getConnection();
//
//		return conn;// "return conn;" 會回傳連線物件 "conn" 到呼叫 "ConnectToDB()" 方法的地方。
//
//	}

	public static void main(String args[]) {
		ConnectionTool ConnectionTool = new ConnectionTool();
		JSONParser jsonParser = new JSONParser();// "JSONParser" 是一個用於解析 JSON 格式的類別，它提供了許多方法來讀取和寫入 JSON 字串
		try {
			Connection conn = ConnectionTool.getConnection();// 建立連綫
			JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("C:/Person.json"));//
			// "jsonParser.parse" 方法接收一個 "FileReader" 對象，它將被用於讀取 JSON 文件
			JSONArray jsonArray = (JSONArray) jsonObject.get("data");// 取得資料的key存到陣列
			PreparedStatement pstmt = conn.prepareStatement(
					"insert into[Person](title,party,name,district,postcode,address,phoneNumber,fax)values (?,?,?,?,?,?,?,?)");
			int count = 0;
			for (Object object : jsonArray) {
				JSONObject record = (JSONObject) object;// 把object轉換爲jsonObject，這樣才能用以下操作
				String title = (String) record.get("職稱");// title=職稱及對應值
				String party = (String) record.get("黨籍");
				String name = (String) record.get("姓名");
				String district = (String) record.get("區別");
				String postcode = (String) record.get("郵遞區號");
				String address = (String) record.get("服務處地址");
				String phoneNumber = (String) record.get("服務處電話");
				String fax = (String) record.get("傳真電話");
				pstmt.setString(1, title);
				pstmt.setString(2, party);
				pstmt.setString(3, name);
				pstmt.setString(4, district);
				pstmt.setString(5, postcode);
				pstmt.setString(6, address);
				pstmt.setString(7, phoneNumber);
				pstmt.setString(8, fax);
				count += pstmt.executeUpdate();

			}
			System.out.println(count + "個人的資料被輸入");

		} catch (FileNotFoundException e) {
			System.out.println("找不到檔案");
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ParseException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
