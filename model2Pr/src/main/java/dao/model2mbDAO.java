package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.model2mbDTO;

public class model2mbDAO {

	private static model2mbDAO instance = new model2mbDAO();

	public static model2mbDAO getinstace() {
		return instance;
	}

	private Connection getConnection() throws Exception {
		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/orcl");
		return ds.getConnection();
	}

	public int insert(model2mbDTO member) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "";

		try {

			con = getConnection();

			sql = "insert into model2mb values(?, ?, ?, ?, ?,";
			sql += " ?, ?, ?, ?, ?, sysdate)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPasswd());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getJumin1());
			pstmt.setString(5, member.getJumin2());
			pstmt.setString(6, member.getMailid());
			pstmt.setString(7, member.getDomain());
			pstmt.setString(8, member.getPost());
			pstmt.setString(9, member.getAddress());
			pstmt.setString(10, member.getIntro());
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

	// ID 중복 체크(ajax)
	public int idcheck(String id) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";

		try {

			con = getConnection();

			sql = "select * from model2mb where id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = 1;
			} else {
				result = -1;
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

	// 로그인
	public int memberAuth(String id, String passwd) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";

		try {

			con = getConnection();

			sql = "select * from model2mb where id =? and passwd = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = 1;
			} else {
				result = -1;
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

	// 회원 수정 폼
	public model2mbDTO getMember(String id) {
		model2mbDTO member = new model2mbDTO();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "";

		try {

			con = getConnection();

			sql = "select * from model2mb where id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				member.setId(rs.getString("id"));
				member.setPasswd(rs.getString("passwd"));
				member.setName(rs.getString("name"));
				member.setJumin1(rs.getString("jumin1"));
				member.setJumin2(rs.getString("jumin2"));
				member.setMailid(rs.getString("mailid"));
				member.setDomain(rs.getString("domain"));
				member.setPost(rs.getString("post"));
				member.setAddress(rs.getString("address"));
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
	public int update(model2mbDTO member) {
		int result = 0;

		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "";

		try {

			con = getConnection();

			sql = "update model2mb set name = ?, jumin1 = ?, jumin2 = ?, ";
			sql += "mailid = ?, domain = ?, post = ?, address = ?, intro = ? ";
			sql += "where id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getJumin1());
			pstmt.setString(3, member.getJumin2());
			pstmt.setString(4, member.getMailid());
			pstmt.setString(5, member.getDomain());
			pstmt.setString(6, member.getPost());
			pstmt.setString(7, member.getAddress());
			pstmt.setString(8, member.getIntro());
			pstmt.setString(9, member.getId());
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
		String sql = "";

		try {

			con = getConnection();

			sql = "delete from model2mb where id = ?";

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
