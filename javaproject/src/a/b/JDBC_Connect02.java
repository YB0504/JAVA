package a.b;
import java.sql.*;

public class JDBC_Connect02{

  public static void main(String[] args)  {

/** aws_ec2 oracle ���� *****************************************/
	String driver = "oracle.jdbc.driver.OracleDriver"; 
	String url = "jdbc:oracle:thin:@13.125.36.254:1521:xe";
/*******************************************************************/

/** aws_rds oracle ���� *****************************************/
//	String driver = "oracle.jdbc.driver.OracleDriver"; 
//	String url = "jdbc:oracle:thin:@orcl.cyqct7nnxb1u.ap-northeast-2.rds.amazonaws.com:1521:orcl";
/*******************************************************************/	
	
	
	
	
/** My-SQL JDBC Driver *********************************************/
//	String driver ="com.mysql.jdbc.Driver";
//	String url = "jdbc:mysql://localhost/academy";
/*******************************************************************/

    Connection con = null;

    try{

      Class.forName(driver);

/**   ORACLE���� Connection ��ü ***********************************/
    con = DriverManager.getConnection(url, "master", "1234" );
/*******************************************************************/

/**   My-SQL���� Connection ��ü ***********************************/
//	  con = DriverManager.getConnection(url, "totoro", "1234" );
/*******************************************************************/

		System.out.println("연결성공~!!");

    } catch(Exception e){
		System.out.println("연결실패~!!");
		e.printStackTrace();
    } finally{
		try{
			if( con != null )         con.close();
		} catch(Exception e){
			System.out.println( e.getMessage( ));  
        }
   }
 }
}  
