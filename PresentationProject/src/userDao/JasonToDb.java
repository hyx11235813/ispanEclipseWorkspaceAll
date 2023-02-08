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

public class JasonToDb {

	public static void main(String args[]) {
		ConnectionTool ConnectionTool = new ConnectionTool();
		JSONParser jsonParser = new JSONParser();//  JSONParser用於解析JSON
		try (Connection conn = ConnectionTool.getConnection()) {
			JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("C:/testPerson/Person.json"));//讀取 JSON 文件
			JSONArray jsonArray = (JSONArray) jsonObject.get("data"); // data的value存到陣列
			PreparedStatement pstmt = conn.prepareStatement("insert into[Person](職稱,黨籍,姓名,區別,郵遞區號,服務處地址,服務處電話,傳真電話)values (?,?,?,?,?,?,?,?)");
			int count = 0;
			for (Object object : jsonArray) {
				JSONObject record = (JSONObject) object;// 把object轉爲jsonObject，才能進行以下操作
				String title = (String) record.get("職稱");// 取得職稱對應值
				String party = (String) record.get("黨籍");
				String name = (String) record.get("姓名");
				String district = (String) record.get("區別");
				String postcode = (String) record.get("郵遞區號");
				String address = (String) record.get("服務處地址");
				String phoneNumber = (String) record.get("服務處電話");
				String fax = (String) record.get("傳真電話");
				pstmt.setString(1, title); // 對應值放入佔位符
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
