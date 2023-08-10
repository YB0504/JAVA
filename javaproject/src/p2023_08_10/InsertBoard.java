package p2023_08_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

public class InsertBoard {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("작성자명을 입력하세요.");
			String writer = br.readLine();
			System.out.println("비밀번호를 입력하세요.");
			String passwd = br.readLine();
			System.out.println("제목을 입력하세요.");
			String subject = br.readLine();
			System.out.println("내용을 입력하세요.");
			String content = br.readLine();

			String sql = "insert into board ";
			sql += "values(board_seq.nextval, ?, ?, ?, ?, sysdate)";
			// board_seq.nextval 입력한 데이터값의 번호가 자동으로 1씩증가

			Timestamp ts = new Timestamp(System.currentTimeMillis());

			pstmt = con.prepareStatement(sql);

			// PreparedStatement객체 (.) set자료형(물음표 번호, 변수명)
			pstmt.setString(1, writer);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);

			// executeUpdate메소드는 int형으로 값을 돌려준다.
			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("데이터 입력 성공");
			} else {
				System.out.println("데이터 입력 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
