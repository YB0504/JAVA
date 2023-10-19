package dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.MemberDTO;

public class MemberDAO {
	
	// 싱글톤은 외부에서 접근하지 못하도록 private접근 제어자로 만든다.
	private static MemberDAO instance = new MemberDAO();
	
	public static MemberDAO getInstance(){
		return instance;
	}
	
	private Connection getConnection() throws Exception{
		Context init = new InitialContext();
  		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/orcl");
  		return ds.getConnection();
	}
	
	// 회원가입
	public int insert(MemberDTO member) {
		int result = 0;
		
		
		
		return result;
	}
}















