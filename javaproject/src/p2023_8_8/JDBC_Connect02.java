package p2023_8_8;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_Connect02 {

	public static void main(String[] args) {

		/** ORACLE JDBC Driver Test *****************************************/
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		// xe 전역 데이터베이스 명이 담겨 있다.
		// localhost 대신 자신의 IP주소를 작성해도 된다.
		// 1521은 자바에서 오라클로 접근하는 고유 포트번호(수정 불가)
		// 현재의 버전은 전역 데이터 명이 orc1이 아니라 xe로 지정되어 있다.
		/*******************************************************************/

		/** My-SQL JDBC Driver *********************************************/
//		String driver ="com.mysql.jdbc.Driver";
//		String url = "jdbc:mysql://localhost/academy";
		/*******************************************************************/

		Connection con = null;

		try {
			// 형식이나 순서를 바꿀 수 없다.
			Class.forName(driver); // JDBC Driver Loading

			/** ORACLE에서 Connection 객체 ***********************************/
			con = DriverManager.getConnection(url, "scott", "tiger");
			// xe 데이터베이스에 접속
			// Connection 객체 리턴
			/*******************************************************************/

			/** My-SQL에서 Connection 객체 ***********************************/
//	  		con = DriverManager.getConnection(url, "totoro", "1234" );
			/*******************************************************************/

			System.out.println("데이터베이스 연결 성공~!!");

		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패~!!");
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
