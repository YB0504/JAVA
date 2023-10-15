package Model1EX;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DAOEX {
	
	private static DAOEX instance = new DAOEX();
	
	public static DAOEX getinstance() {
		return instance;
	}
	
	private Connection getConnection() throws Exception{
		Context init = new InitialContext();
  		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/orcl");
  		return ds.getConnection();
	}
	
	// 원문 게시글 작성
	public int insert(DTOEX board) {
		int result = 0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			con = getConnection();
			
			String sql = "insert into boardex values(boardex_seq.nextval, ";
			sql += "?, ?, ?, ?, ?, ?, sysdate, ?, boardex_seq.nextval, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getSubject());
			pstmt.setString(3, board.getEmail());
			pstmt.setString(4, board.getContent());
			pstmt.setString(5, board.getPasswd());
			pstmt.setString(6, board.getIp());
			pstmt.setInt(7, 0);
			pstmt.setInt(8, 0);
			pstmt.setInt(9, 0);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
