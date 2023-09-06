import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LetsConnectWithDatabase {

	public static void main(String[] args) {

		Connection conn1 = null;
		Connection conn2 = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/hplus?user=root&password=root";
			conn1 = DriverManager.getConnection(dbUrl);
			if (conn1 != null) {
				System.out.println("Connection Using Connection Conn1");

			}
			String dbURL2 = "jdbc:mysql://localhost:3306/hplus";
			String username = "root";
			String password = "root";

			conn2 = DriverManager.getConnection(dbURL2, username, password);
			if (conn2 != null) {
				System.out.println("Connection Using Connection Conn1");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {

				if (conn1 != null && !conn1.isClosed()) {

					conn1.close();

				}

				if (conn2 != null && !conn2.isClosed()) {

					conn2.close();

				}

			} catch (SQLException e) {

				e.printStackTrace();

			}

		}

	}

}
