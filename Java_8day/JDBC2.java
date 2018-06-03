import java.sql.*;


public class JDBC2 {
	public void insert(String id, String pw, String name, String tel) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 설정성공");
		String url = "jdbc:mysql://localhost:3306/shoes";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2.DB연결 성공.!!");
		String sql = "insert into member values( ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL문 객체화 성공!");
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		
		ps.executeUpdate();
		System.out.println("4. SQL실행성공");
	}
}
