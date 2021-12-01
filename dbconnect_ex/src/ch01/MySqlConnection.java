package ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnection {
	private static Connection conn; // DB 커넥션 연결 객체
	private static final String USERNAME = "root";
	private static final String PASSWORD = "asd1234";
	private static final String URL = "jdbc:mysql://localhost:3306/shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";

	private static Statement stmt = null;
	// 문자열을 쿼리문으로 만들어줌
	private static ResultSet rs = null;
	//Set 계열로 결과를 담아두는 객체
	
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 드라이버 객체를 메모리에 올리는 과정
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = conn.createStatement();

			// 질의어 생성
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
