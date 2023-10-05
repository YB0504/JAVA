// DAO(Data Access Object)

package register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class LogonDBBean {

	// 싱글톤 : 객체 생성을 한번만 수행하는 것
	private static LogonDBBean instance = new LogonDBBean();

	// 공유를 위한 정적 메소드 생성
	// 사용할 때는 LogonDBBean.getInstance()로 호출하여 사용한다.
	public static LogonDBBean getInstance() {
		return instance;
	}

	// 회원가입 메소드
	// 주소값 전달에 의한 메소드 호출 방식 (Call by Reference 방식)
	// 매개변수를 통해 insert할 데이터를 전달해야 한다.
	public int insertMember(LogonDataBean member) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			// JDBC 방식
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			// 컬럼명을 작성하지 않는 방식의 insert SQL문
			String sql = "insert into member2 values(?,?,?,?,?,?,?,sysdate)";

			pstmt = con.prepareStatement(sql);

			// 직접 메소드를 호출하여 값을 전달
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPasswd());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getJumin1());
			pstmt.setString(5, member.getJumin2());
			pstmt.setString(6, member.getEmail());
			pstmt.setString(7, member.getBlog());

			// insert SQL문 실행
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

	// 전체 회원목록 구하기
	// 두 명이상의 데이터를 구하기 때문에 List가 자료형으로 와야한다.
	// 제네릭을 사용하여 DTO클래스 내부의 자료만 사용한다.
	public List<LogonDataBean> selectMember() {
		// List 객체 생성
		// List는 자체 객체 생성이 안되기 때문에 ArrayList로 객체 생성
		List<LogonDataBean> list = new ArrayList<LogonDataBean>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			String sql = "select * from member2";

			pstmt = con.prepareStatement(sql);

			// select SQL문 실행
			rs = pstmt.executeQuery();

			/* SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); */

			// 검색할 데이터를 한개씩 가져온다.
			while (rs.next()) { // 데이터를 가져오면 true값을 리턴하여 while문을 실행
				// 저장된 값을 바로 List에 저장하지 않고
				// DTO클래스로 객체 생성하여 DTO클래스에 저장한다.
				LogonDataBean member = new LogonDataBean();

				// 컬럼단위로 잘라서 setter메소드의 매개변수로 값을 전달한다.
				member.setId(rs.getString("id"));
				member.setPasswd(rs.getString("passwd"));
				member.setName(rs.getString("name"));
				member.setJumin1(rs.getString("jumin1"));
				member.setJumin2(rs.getString("jumin2"));
				member.setEmail(rs.getString("email"));
				member.setBlog(rs.getString("blog"));
				member.setReg_date(rs.getDate("reg_date"));

				// list객체에 검색한 값을 순차적으로 저장
				list.add(member);
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

		return list;
	}

	// 회원정보 수정 폼 : 회원 1명의 정보를 구한다.
	// 한개의 자료를 구해올 때는 자료형 위치에 DTO클래스를 작성한다.
	// 회원의 id를 매개변수로 받는다.
	public LogonDataBean updateForm(String id) {
		LogonDataBean member = new LogonDataBean();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			String sql = "select * from member2 where id=?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			// 가져올 데이터가 하나밖에 없기 때문에 if문으로 구해온다.
			if (rs.next()) {
				// 직접 접근할 수 없다.
				// 검색한 id값에 대한 데이터들을 가져온다.
				// 컬럼단위로 잘라서 setter메소드의 매개변수로 값을 전달한다.
				member.setId(rs.getString("id"));
				member.setPasswd(rs.getString("passwd"));
				member.setName(rs.getString("name"));
				member.setJumin1(rs.getString("jumin1"));
				member.setJumin2(rs.getString("jumin2"));
				member.setEmail(rs.getString("email"));
				member.setBlog(rs.getString("blog"));
				member.setReg_date(rs.getDate("reg_date"));
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

	// 회원정보 수정
	public int update(LogonDataBean member) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			String sql = "update member2 set name=?, jumin1=?, jumin2=?,";
			sql += "email=?, blog=?, reg_date=sysdate where id=?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getJumin1());
			pstmt.setString(3, member.getJumin2());
			pstmt.setString(4, member.getEmail());
			pstmt.setString(5, member.getBlog());
			pstmt.setString(6, member.getId());

			// 실행한 SQL문을 result로 돌려준다.
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

	// 회원정보 삭제
	public int delete(LogonDataBean member) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			String sql = "delete from member2 where id =?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
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
