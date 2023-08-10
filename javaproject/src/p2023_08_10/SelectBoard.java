package p2023_08_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class SelectBoard {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection con = null;

		// SQL문을 실행하기 위해 PreparedStatement객체 생성
		PreparedStatement pstmt = null;
		// 결과를 돌려 받기위한 ResultSet객체 생성
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		// 총 데이터 개수를 세기 위한 count함수값 초기화
		int count = 0;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			// 총 데이터 개수를 구해오는 SELECT SQL문
			String sql = "select count (*) from board";

			pstmt = con.prepareStatement(sql);
			rs1 = pstmt.executeQuery(); // select SQL문 실행

			// 검색한 데이터를 하나씩 가져온다.
			if (rs1.next()) {
				// getInt메소드로 1에서부터 값을 가져와서 count함수에 저장
				count = rs1.getInt(1);
//				count = rs1.getInt("count(*)");
			}
			System.out.println("작성된 글 : " + count + "\n");

			sql = "select * from board order by no asc";
			System.out.println("번호\t작성자\t비밀번호\t제목\t\t내용\t\t날짜");
			System.out.println("-----------------------------------------------------------------\n");

			pstmt = con.prepareStatement(sql);
			rs2 = pstmt.executeQuery();

			SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss EEE요일");

			// PreparedStatement객체 (.) get자료형
			while (rs2.next()) {
				int no = rs2.getInt("no");
				String writer = rs2.getString("writer");
				String passwd = rs2.getString("passwd");
				String subject = rs2.getString("subject");
				String content = rs2.getString("content");
				Timestamp ts = rs2.getTimestamp("reg_date");
				System.out.print(no + "\t" + writer + "\t" + passwd + "\t");
				System.out.print(subject + "\t\t" + content + "\t\t" + sd.format(ts) + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 선언한 반대 순서로 닫는다.
				if (rs2 != null)
					rs2.close();

				if (rs1 != null)
					rs1.close();

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
