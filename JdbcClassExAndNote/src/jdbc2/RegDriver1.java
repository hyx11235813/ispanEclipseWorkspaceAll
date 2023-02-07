package jdbc2;

public class RegDriver1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("OK");
		} catch (ClassNotFoundException e) {
			System.out.println("NG");
			e.printStackTrace();
		}//註冊驅動程序，以便連接SQL Server數據庫
	}

}
