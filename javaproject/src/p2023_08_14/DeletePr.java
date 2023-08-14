package p2023_08_14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeletePr {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest";

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("삭제할 고객번호를 입력하세요.");
			int no = Integer.parseInt(br.readLine());

			String sql = "delete from customer where no = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);

			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("고객정보 삭제 성공");
			} else {
				System.out.println("고객정보 삭제 실패");
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
