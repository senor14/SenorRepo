package db.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import db.conn.DBConn;

public class DBinsert {

	public void doInsert(Map<String, String> pMap) {
		
		try {
			
			// ����Ŭ �����ϱ�
			Connection conn = DBConn.getDBConnection();
			
			// ����Ŭ�� SQL������ �����ϱ� ���� ��ü
			PreparedStatement pstmt = null;
			
			// SQL ����
			String sql = "INSERT INTO USER_INFO(USER_ID, USER_NM, EMAIL, ADDR) VALUES (";
			sql += "?, "; // INSERT INTO ���������� ù��° Į���� USER_ID�� ��Ī��
			sql += "?, "; // INSERT INTO ���������� �ι�° Į���� USER_NM�� ��Ī��
			sql += "?, "; // INSERT INTO ���������� ����° Į���� EMAIL�� ��Ī��
			sql += "?) "; // INSERT INTO ���������� �׹�° Į���� ADDR�� ��Ī�� (REG_DT)�� INSERT INTO ������ ��� ����
			
			// ����Ŭ�� ���޵� SQL ������ �����ϱ�
			pstmt = conn.prepareStatement(sql);
			
			int idx = 0; // ? ������ �����ϱ� ���� ����
			
			// ���޹��� pMap ��ü�� ���� SQL ������ ?�� �����ϱ�
			
			String user_id = pMap.get("user_id");
			System.out.println("���޹��� user_id : " + user_id);
			pstmt.setString(++idx,  user_id); // ù��° ?
			
			String user_nm = pMap.get("user_nm");
			System.out.println("���޹��� user_nm : " + user_nm);
			pstmt.setString(++idx,  user_nm); // �ι�° ?
			
			String email = pMap.get("email");
			System.out.println("���޹��� email : " + email);
			pstmt.setString(++idx,  email); // ����° ?
			
			String addr = pMap.get("addr");
			System.out.println("���޹��� addr : " + addr);
			pstmt.setString(++idx,  addr); // �׹�° ?
			
			// insert ���� ����
			int res = pstmt.executeUpdate();
			
			if (res > 0) {
				System.out.println("������ ��� ����!");
			} else {
				System.out.println("������ ��� ����!");
			}
			
			pstmt = null;
			
			// ����Ŭ DB ���� ����
			DBConn.DBClose(conn);
		
		} catch (Exception e) {
			System.out.println(e.toString());
		
		}
	}
}
