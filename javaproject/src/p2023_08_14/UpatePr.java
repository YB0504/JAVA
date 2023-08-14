package p2023_08_14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpatePr {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest";

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("내용을 변경할 고객번호를 입력하세요.");
			int no = Integer.parseInt(br.readLine());
			System.out.println("고객명을 입력하세요.");
			String name = br.readLine();
			System.out.println("이메일을 입력하세요.");
			String email = br.readLine();
			System.out.println("전화번호를 입력하세요.");
			String tel = br.readLine();
			System.out.println("주소를 입력하세요.");
			String address = br.readLine();

			String sql = "update customer set name = ?, email = ?, tel = ?, ";
			sql += " address = ?, reg_date = sysdate() where no = ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, tel);
			pstmt.setString(4, address);
			pstmt.setInt(5, no);

			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("변경이 성공하였습니다.");
			} else {
				System.out.println("변경이 실패하였습니다.");
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
