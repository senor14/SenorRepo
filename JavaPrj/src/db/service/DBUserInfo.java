package db.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.conn.DBConn;

public class DBUserInfo {

	public List<Map<String, String>> getUserInfo() {
		
		// DB��ȸ ����� �����ϱ� ���� List�� Map�� Ȱ���� ������ ����
		List<Map<String, String>> rList = null;
		
		try {
			
			// ����Ŭ �����ϱ�
			Connection conn = DBConn.getDBConnection();
			
			// ����Ŭ�� SQL������ �����ϱ� ���� ��ü
			PreparedStatement pstmt = null;
			
			// SQL ����
			String sql = "SELECT USER_ID, USER_NM, EMAIL, ADDR, REG_DT FROM USER_INFO";
			
			// ����Ŭ�� ���޵� SQL ������ �����ϱ�
			pstmt = conn.prepareStatement(sql);
			
			// SQL ��ȸ ������ �����ϰ�, rs ������ ����� �����ϱ�
			// ResultSet ��ü�� Map �ڷ� ����(Ű�� ������ ����)�� ����Ŭ�� �����ϵ��� ������ �ڹ� ��ü
			// ResultSet ��ü�� DB�κ��� ��µǴ� ���ڵ��� ���� 2���̻��̸�, �ڵ����� List�迭�� Map ������ ������
			ResultSet rs = pstmt.executeQuery(sql);
			
			// ���̺� ��ȸ ����� �����ϱ� ���� ������ ������ �޸𸮿� �ø���
			rList = new ArrayList<Map<String, String>>();
			
			while (rs.next()) {
				
				// ���̺��� ���ڵ� ���ٸ��� rMap ��ü�� ����
				Map<String, String> rMap = new HashMap<String, String>();
				
				// ȸ�� ���̵�
				String user_id = rs.getString("USER_ID");
				System.out.println("user_id : " + user_id);
				
				rMap.put("user_id", user_id);
				
				// ȸ�� �̸�
				String user_nm = rs.getString("User_NM");
				System.out.println("user_nm : " + user_nm);
				
				rMap.put("user_nm", user_nm);
				
				// �̸����ּ�
				String email = rs.getString("EMAIL");
				System.out.println("email : " + email);
				
				rMap.put("email", email);
				
				// ���ּ�
				String addr = rs.getString("ADDR");
				System.out.println("addr : " + addr);
				
				rMap.put("addr", addr);
				
				// ȸ�� ������
				String reg_dt = rs.getString("REG_DT");
				System.out.println("reg_dt : " + reg_dt);
				
				rMap.put("reg_dt", reg_dt);
				
				rList.add(rMap);
				
				//����� ������ �޸� ����
				rMap = null;
			}
			
			// ����Ŭ�κ��� ���޹��� ����� ����� ������ �޸𸮸� �����ؾ���
			// �������� ������ ����Ŭ DB�� ��� ������ �����ǰ� �־� DB�� ������ ������
			rs.close();
			
			// ����Ŭ DB ���� ����
			DBConn.DBClose(conn);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return rList;
		
	}
}
