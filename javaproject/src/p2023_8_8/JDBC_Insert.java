package p2023_8_8;

// 도스 콘솔 창에서 사용자 입력을 받아들이기 위해 BufferedReader 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class JDBC_Insert {
	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection con = null;	// 데이터베이스 연결 객체
		Statement stmt = null;	// SQL문을 실행 시켜주는 객체

		// ResultSet rs = null;
		String sql;

		String name, email, tel, no;

		try {
			Class.forName(driver);	// JDBC Driver Loading
			con = DriverManager.getConnection(url, "scott", "tiger");
			// 공통 코드
			
			// Statement 객체를 구해오는 코드
			stmt = con.createStatement();

			// ---JDBC_Insert 추가된 내용-------
			// 테이블에 추가할 내용을 도스 콘솔 창에서 사용자의 입력을 받도록 한다.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println(" customer 테이블에 값 입력하기 .....");
			System.out.print(" 번호 입력: ");
			no = br.readLine();
			System.out.print(" 이름 입력: ");
			name = br.readLine(); // 테이블에 추가할 name 필드 값을 입력 받음
			System.out.print(" 이메일 입력: ");
			email = br.readLine(); // 테이블에 추가할 email 필드 값을 입력 받음
			System.out.print(" 전화번호 입력: ");
			tel = br.readLine(); // 테이블에 추가할 tel 필드 값을 입력 받음

			// INSERT 쿼리문을 작성
			// 직접 자바 코드로 구현해야 한다.
			sql = "INSERT into customer(no, name, email, tel) values ";
			// values 다음 한칸 간격을 벌린다.(맨앞에서 해도된다)
			sql += "(" + no + ",'" + name + "','" + email + "','" + tel + "')";

			// Statement 객체의 executeUpdate(sql) 메서드를 이용해
			int res = stmt.executeUpdate(sql); // 데이터베이스 파일에 새로운 값을 추가시킴
			if (res == 1) {
				System.out.println(" Data insert success!! ");
			} else {
				System.out.println(" Data insert failed ");
			}
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!");
		} finally {
			try {
				// if( rs != null ) rs.close();
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
