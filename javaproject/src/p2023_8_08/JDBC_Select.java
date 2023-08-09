package p2023_8_08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class JDBC_Select {
	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection con = null;	// 데이터베이스 연결 객체
		Statement stmt = null;	// SQL문을 실행 시켜주는 객체
		// ---JDBC_Select 추가된 내용 -------
		ResultSet rs = null;	// 검색한 결과를 관리 해주는 객체
		int no = 0;
		String name, email, tel; // 데이터베이스에서 얻어온 필드값 저장할 변수 선언
		String sql; // SQL문을 저장할 변수 선언

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println(con);
			// 공통 코드
			
			// SQL문을 실행 시켜주는 객체
			stmt = con.createStatement();
			System.out.println(stmt);
			
			// ---JDBC_Select 추가된 내용 -------
			sql = "SELECT * FROM customer";
			
			System.out.printf("번호 \t 이름 \t\t 이메일 \t\t 전화번호 \n");
			System.out.printf("-----------------------------------------------------------------\n");
			
			// select SQL문을 사용할 때는 executeQuery()로 실행한다.
			// 결과값을 ResultSet객체로 돌려준다.
			rs = stmt.executeQuery(sql); // 얻어진 레코드를 가져옴
			System.out.println(rs);

			// 반복문 사용해서 검색한 결과를 하나씩 가져온다.
			// boolean next() : 검색한 데이터를 1개씩 가져오는 역할
			while (rs.next()) {
				no = rs.getInt("no"); // 컬럼값을 구해와서 no컬럼 변수에 저장
				name = rs.getString("name");
				email = rs.getString("email");
				tel = rs.getString("tel");
				System.out.printf(" %d \t %s \t %s \t %s\n", no, name, email, tel);
			}
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!");
		} finally {
			try {// rs, stmt, con 객체를 close() 메서드를 호출해 해제
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
