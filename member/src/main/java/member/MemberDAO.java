package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	// 예외처리를 해야한다.
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

	// ID 중복검사
	public int memberAuth(String id) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// DBCP 방식으로 커넥션 구해오기
			con = getConnection();

			String sql = "select * from member where id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = 1; // 중복 ID
			} else {
				result = -1; // 사용 가능한 ID
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
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

	// 로그인(회원 인증 처리)
	public int memberCheck(MemberDTO member) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			con = getConnection();

			String sql = "select * from member where id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			rs = pstmt.executeQuery();

			if (rs.next()) {
				if (rs.getString("passwd").equals(member.getPasswd())) {
					result = 1; // 회원 인증 성공
				} else {
					result = -1; // 회원 인증 실패
				}
			} else {
				result = -2; // ID 불일치
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
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

	// 회원 정보 수정 폼 : 회원 한명의 상세 정보 구하기
	public MemberDTO getMember(String id) {
		MemberDTO member = new MemberDTO();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			con = getConnection();

			String sql = "select * from member where id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				// 직접 접근이 불가능 하기 때문에
				// setter메소드로 컬럼별로 잘라서 값을 할당한다.
				member.setId(rs.getString("id"));
				member.setPasswd(rs.getString("passwd"));
				member.setName(rs.getString("name"));
				member.setJumin1(rs.getString("jumin1"));
				member.setJumin2(rs.getString("jumin2"));
				member.setMailid(rs.getString("mailid"));
				member.setDomain(rs.getString("domain"));
				member.setTel1(rs.getString("tel1"));
				member.setTel2(rs.getString("tel2"));
				member.setTel3(rs.getString("tel3"));
				member.setPhone1(rs.getString("phone1"));
				member.setPhone2(rs.getString("phone2"));
				member.setPhone3(rs.getString("phone3"));
				member.setPost(rs.getString("post"));
				member.setAddress(rs.getString("address"));
				member.setGender(rs.getString("gender"));
				member.setHobby(rs.getString("hobby"));
				member.setIntro(rs.getString("intro"));
				member.setRegister(rs.getTimestamp("register"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return member;
	}

	// 회원 정보 수정
	public int update(MemberDTO member) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			con = getConnection();

			String sql = "update member set name=?, jumin1=?, jumin2=?, mailid=?, ";
			sql += "domain=?, tel1=?, tel2=?, tel3=?, phone1=?, phone2=?, phone3=?, ";
			sql += "post=?, address=?, gender=?, hobby=?, intro=? where id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getJumin1());
			pstmt.setString(3, member.getJumin2());
			pstmt.setString(4, member.getMailid());
			pstmt.setString(5, member.getDomain());
			pstmt.setString(6, member.getTel1());
			pstmt.setString(7, member.getTel2());
			pstmt.setString(8, member.getTel3());
			pstmt.setString(9, member.getPhone1());
			pstmt.setString(10, member.getPhone2());
			pstmt.setString(11, member.getPhone3());
			pstmt.setString(12, member.getPost());
			pstmt.setString(13, member.getAddress());
			pstmt.setString(14, member.getGender());
			pstmt.setString(15, member.getHobby());
			pstmt.setString(16, member.getIntro());
			pstmt.setString(17, member.getId());
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

	// 회원 탈퇴
	public int delete(String id) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {

			con = getConnection();

			String sql = "delete from member where id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
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
