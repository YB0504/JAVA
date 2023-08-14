package p2023_08_14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class SelectPr {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs01 = null;
		ResultSet rs02 = null;

		int count = 0;

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest";

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass");

			String sql = "select count(*) from customer";

			pstmt = con.prepareStatement(sql);
			rs01 = pstmt.executeQuery();
			if (rs01.next()) {
				count = rs01.getInt(1);
			}
			System.out.println("가입된 고객 수 : " + count + "\n");

			sql = "select * from customer";

			System.out.println("번호\t고객명\t이메일\t\t전화번호\t\t주소\t\t날짜");
			System.out.println("------------------------------------------------------------------------\n");

			pstmt = con.prepareStatement(sql);
			rs02 = pstmt.executeQuery();

			SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd/ HH:mm:ss EEE");

			while (rs02.next()) {
				int no = rs02.getInt("no");
				String name = rs02.getString("name");
				String email = rs02.getString("email");
				String tel = rs02.getString("tel");
				String address = rs02.getString("address");
				Timestamp ts = rs02.getTimestamp("reg_date");
				System.out.print(no + "\t" + name + "\t" + email + "\t");
				System.out.print(tel + "\t" + address + "\t" + sd.format(ts) + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs02 != null)
					rs02.close();
				if (rs01 != null)
					rs01.close();
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
