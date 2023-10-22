package dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class model2mbDAO {

	private static model2mbDAO instance = new model2mbDAO();
	
	public static model2mbDAO getinstace() {
		return instance;
	}
	
	private Connection getConnection()throws Exception{
		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/orcl");
		return ds.getConnection();
	}
	
}
