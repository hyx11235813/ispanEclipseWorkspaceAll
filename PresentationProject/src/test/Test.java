package test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test {

	public static void main(String[] args) {
		try {
			URL url=new URL("https://soa.tainan.gov.tw/Api/Service/Get/a5a4c65c-144f-4bd6-8fb3-5c98e0fc6e24");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
