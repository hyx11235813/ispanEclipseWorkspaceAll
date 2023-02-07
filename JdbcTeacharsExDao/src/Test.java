import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {

	public static void main(String[] args) {
		try {
			URL url=new URL("https://ws.ndc.gov.tw/Download.ashx?u=LzAwMS9hZG1pbmlzdHJhdG9yLzEwL3JlbGZpbGUvMC8xMTMzOS85YTM0NDZkOC1iOWU0LTRlOGUtYjE0Zi1kNWMyMjEzNTA1MTcuY3N2&n=6L%2bR5bm056aP5Yip5rSl6LK857Wm5LuY6YeR6aGNLmNzdg%3d%3d&icon=..csv");
			InputStream openStream = url.openStream();//openStream()從URL中讀取數據//打開url讓inputstream讀取
			//InputStream 是 Java 中的類別，其功能是讀取輸入的資料
			InputStreamReader isr=new InputStreamReader(openStream);// openStream 讀取到的輸入流轉換為字符輸入流，更適合處理文本數據
			BufferedReader bufferedReader = new BufferedReader(isr);//將isr以一行一行的方式讀取，提高讀取效率
			String str="";
			while((str=bufferedReader.readLine())!=null) {//循環讀取BufferedReader中的每一行數據，並將其存儲在str中
				String[] split = str.split(",");//逗號為界限分割成多個字串，並將字串儲存在字串陣列 "split" 中
				for (int i = 0; i < split.length; i++) {
					String string = split[i];//從split陣列0的資料開始，把每一行印出來
					System.out.println(string);
					
				}
			}
		
		
		
		
		  
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
}
