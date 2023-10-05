package member;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {

	// 싱글톤 객체 생성
	private static MemberDAO instance = new MemberDAO();

	// 싱글톤 객체 공유를 위한 정적메소드 생성
	public static MemberDAO getInstance() {
		return instance;
	}

	// 커넥션 풀에서 커넥션을 구해오는 메소드 생성
	private Connection getConnection() throws Exception {
		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/orcl");

		// getConnection의 자료형인 Connection으로 return
		return ds.getConnection();
	}

	// 회원가입
	public int insert(MemberDTO member) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;

		// 커넥션 풀에서 커넥션을 구해왔기 때문에 드라이버와 URL이 필요하지 않다.
		try {
			// 커넥션 풀에서 커넥션을 쿠해오는 코드
			con = getConnection();

			// sql+= 로 연결해서 sql문을 작성할 때는 뒤나 앞쪽에
			// 한칸 띄워서 작성하여야한다.
			String sql = "insert into member ";
			sql += " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,sysdate)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPasswd());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getJumin1());
			pstmt.setString(5, member.getJumin2());
			pstmt.setString(6, member.getMailid());
			pstmt.setString(7, member.getDomain());
			pstmt.setString(8, member.getTel1());
			pstmt.setString(9, member.getTel2());
			pstmt.setString(10, member.getTel3());
			pstmt.setString(11, member.getPhone1());
			pstmt.setString(12, member.getPhone2());
			pstmt.setString(13, member.getPhone3());
			pstmt.setString(14, member.getPost());
			pstmt.setString(15, member.getAddress());
			pstmt.setString(16, member.getGender());
			pstmt.setString(17, member.getHobby());
			pstmt.setString(18, member.getIntro());
			result = pstmt.executeUpdate();

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

		return result;
	}

}
