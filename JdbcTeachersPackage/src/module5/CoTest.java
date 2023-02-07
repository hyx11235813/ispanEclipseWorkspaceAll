package module5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class CoTest {

	public static void main(String[] args) {
		try {
//			URL url=new URL("");
//			InputStream openStream = url.openStream();
			FileInputStream fis=new FileInputStream("C:/java/aaa.txt");
			
			InputStreamReader isr=new InputStreamReader(fis, "UTF-8");
			BufferedReader br=new BufferedReader(isr);
			String s="";
//			while((s=br.readLine())!=null) {
//				System.out.println(s);
//			}
			System.out.println(br);
			br.close();
			isr.close();
			fis.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
