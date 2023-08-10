package p2023_08_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

public class UpdateBoard {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection con = null;
		// SQL문을 실행하기 위해 PreparedStatement객체 생성
		PreparedStatement pstmt = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			Timestamp ts = new Timestamp(System.currentTimeMillis());

			System.out.println("변경할 번호를 입력하세요.");
			int no = Integer.parseInt(br.readLine());
			System.out.println("작성자명을 변경하세요.");
			String writer = br.readLine();
			System.out.println("비밀번호을 변경하세요.");
			String passwd = br.readLine();
			System.out.println("제목을 변경하세요.");
			String subject = br.readLine();
			System.out.println("내용을 변경하세요.");
			String content = br.readLine();

			// 가입날짜에서 수정한 날짜로 변경할 때 reg_date = sysdate 작성
			String sql = "update board set writer = ?, passwd = ?, subject = ?,";
			sql += "content = ?, reg_date = sysdate where no = ?";

			pstmt = con.prepareStatement(sql);
			
			// PreparedStatement객체 (.) set자료형(물음표 번호, 변수명)
			pstmt.setString(1, writer);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setInt(5, no);

			// executeUpdate메소드는 int형으로 값을 돌려준다.
			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("데이터 수정 성공");
			} else {
				System.out.println("데이터 수정 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					;
				pstmt.close();
				if (con != null)
					;
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
