package p2023_08_11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteBoard {

	public static void main(String[] args) {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest";

		Connection con = null;
		// SQL문을 실행하기 위해 PreparedStatement객체 생성
		PreparedStatement pstmt = null;

		try {
			// 공통 코드
			Class.forName(driver); // 선언한 JDBC드라이버를 로딩
			con = DriverManager.getConnection(url, "jspid", "jsppass");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("삭제할 번호를 입력하세요.");
			int no = Integer.parseInt(br.readLine());

			String sql = "delete from board where no = ?";
			
			pstmt = con.prepareStatement(sql);
			
			// PreparedStatement객체 (.) set자료형(물음표 번호, 변수명)
			pstmt.setInt(1, no);
			
			// executeUpdate메소드는 int형으로 값을 돌려준다.
			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println(" 데이터 삭제 성공!! ");
			} else {
				System.out.println(" 데이터 삭제 실패 ");
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
