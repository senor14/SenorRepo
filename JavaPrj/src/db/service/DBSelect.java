package db.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.conn.DBConn;

public class DBSelect {

	public static void main(String[] args) throws SQLException {

		// ����Ŭ �����ϱ�
		Connection conn = DBConn.getDBConnection();
		
		// ����Ŭ�� SQL������ �����ϱ� ���� ��ü
		PreparedStatement pstmt = null;
		
		// SQL ����
		String sql = "SELECT COUNT(1) AS CNT FROM USER_INFO";
		
		// ����Ŭ�� ���޵� SQL ������ �����ϱ�
		pstmt = conn.prepareStatement(sql);
		
		// SQL ��ȸ ������ �����ϰ�, rs ������ ����� �����ϱ�
		// REsultSet ��ü�� Map �ڷ� ����(Ű�� ������ ����)�� ����Ŭ�� �����ϵ��� ������ �ڹ� ��ü
		ResultSet rs = pstmt.executeQuery(sql);
		
		if (rs.next()) {
			
			String cnt = rs.getString("CNT");
			System.out.println("ȸ�������� �� CNT : " + cnt);
		}
		
		// ����Ŭ�κ��� ���޹��� ����� ����� ������ �ٷ� �޸𸮸� �����ؾ���
		// �������� ������ ����Ŭ DB�� ��� ������ �����ǰ� �־� DB�� ������ ����¡
		rs.close();
		
		// ����Ŭ DB ���� ����
		DBConn.DBClose(conn);

	}

}
