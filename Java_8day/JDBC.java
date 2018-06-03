import java.sql.*;


public class JDBC {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 설정성공");
		String url = "jdbc:mysql://localhost:3306/shoes";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB연결 성공.!!");
		String sql = "Delete from member where id = '100'";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL문 객체화 성공!");
		ps.executeUpdate(sql);
		System.out.println("4. SQL실행성공");
	}
}
