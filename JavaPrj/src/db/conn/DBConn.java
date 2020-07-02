package db.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	/**
	 * ����Ŭ DB�� �����ϱ�
	 * 
	 * @return Connection ����Ŭ DB ���� ��ü
	 */
			
	
	
	public static Connection getDBConnection() throws SQLException {
		
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		
		String user = "myuser";
		String passwd = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, passwd);
			
			System.out.println("����Ŭ ���� ����!!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("����Ŭ ���� ����");
			System.out.println("ojdbc6.jar ���Ͽ� �����ϴ� �ڹ� ������ ã�� ����");
			System.out.println("���� : " + e.toString());
			
		} catch (Exception e) {
			System.out.println("����Ŭ ���� ���� - ���� Exception���� ȣ����");
			System.out.println("���� : " + e.toString());
			
		}
		
		// ����Ŭ DB�� ����� �ڹ� ��ü�� ��� ���� �����Ѵ�.
		return conn;
	}
	/**
	 * ������ ����� ����Ŭ DB�� ���� �����ϱ� / ��, �޸𸮿� �ö� Connection ��ü�� �޸𸮿� �����
	 * 
	 * @param Connection ���� ����ŬDB�� ����� �ڹ� ��ü
	 */
	public static void DBClose(Connection pConn) throws SQLException{
		pConn.close();
	}

}
