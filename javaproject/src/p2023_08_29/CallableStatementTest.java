package p2023_08_29;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

class CallableStatementTest {

	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = null;
		CallableStatement cs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");

			// 매개 변수가 없기 때문에 프로시저명()만 존재한다.
			sql = "{call del_all()}";

			// CallableStatement를 객체를 생성
			cs = con.prepareCall(sql);
			cs.execute();	// 저장 프로시저 실행
			
			System.out.println("프로시저 실행 완료");

			cs.close();
			con.close(); // 정상 종료가 되는 것이기 때문에 Oracle에서 롤백이 되지 않는다.
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
