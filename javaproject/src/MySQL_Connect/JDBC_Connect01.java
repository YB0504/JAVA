package MySQL_Connect;

public class JDBC_Connect01 {

	public static void main(String[] args) {

		/** ORACLE JDBC Driver Test ***************************/
//	String driver = "oracle.jdbc.driver.OracleDriver";  
		/******************************************************/

		/** My-SQL JDBC Driver Test **************************/
		String driver = "com.mysql.cj.jdbc.Driver";
		// com.mysql.jdbc. : 패키지명
		// Driver : byte코드
		/*****************************************************/

		try {
			Class.forName(driver);
			System.out.println("JDBC Driver Loading 성공~!!");

		} catch (Exception e) {
			System.out.println("JDBC Driver Loading 실패~!!");
			e.printStackTrace();
		}
	}
}
