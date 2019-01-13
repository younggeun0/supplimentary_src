package example0112.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Singleton pattern ���� ����� Ŭ����<br>
 * DB Connection �� ��ȯ�ϴ� ��.
 * @author owner
 */
public class GetConnetion {
	private static GetConnetion gc;
	
	private GetConnetion() {
		
	}
	
	public static GetConnetion getInstance() {
		if(gc ==null) {
			gc = new GetConnetion();
		}//end if
		return gc;
	}//getInstance
	
	public Connection getConn(String url, String id, String pass) throws SQLException{
		Connection con =null;
		//1. ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}//end catch
		//2. Connection���
		con = DriverManager.getConnection(url, id, pass);
		return con;
	}//getConn
	
	
}//class
