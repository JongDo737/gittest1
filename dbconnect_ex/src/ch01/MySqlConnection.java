package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnection {
	private static Connection conn; // DB Ŀ�ؼ� ���� ��ü
	private static final String USERNAME = "root";
	private static final String PASSWORD = "asd1234";
	private static final String URL = "jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";

	private static Statement stmt = null;
	// ���ڿ��� ���������� �������
	private static ResultSet rs = null;
	//Set �迭�� ����� ��Ƶδ� ��ü
	
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// ����̹� ��ü�� �޸𸮿� �ø��� ����
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = conn.createStatement();

			// ���Ǿ� ����
			String sql = "SELECT * FROM membertbl";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String memberId = rs.getString("memberID");
				String memberName = rs.getString("memberName");

				System.out.println("memberid : " + memberId);
				System.out.println("memberName : " + memberName);

			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			try {
				conn.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
