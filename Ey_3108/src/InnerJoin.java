import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class InnerJoin {

	static {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

		}

		catch (ClassNotFoundException e) {

			e.printStackTrace();

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CallableStatement stmt = null;
		Connection conn = null;

		PreparedStatement ps = null;

		ResultSet rs = null;

		try {

			String dbURL = "jdbc:mysql://localhost:3306/hplus?user=root&password=root";

			conn = DriverManager.getConnection(dbURL);

			if (conn != null) {

				System.out.println("Connection establised using connection");

			}
			System.out.println("Enter country ID");
			int id = Integer.parseInt(sc.nextLine());

			String query = "SELECT * FROM country_tab c INNER JOIN state_tab s ON c.country_id=s.country_id where c.country_id = ?";
			ps = conn.prepareStatement(query);
			
			ps.setInt(1, id);

			//ps = conn.prepareStatement(query);

			rs = ps.executeQuery();

			while (rs.next()) {

				System.out.println(rs.getInt(1) +

						"\t" + rs.getString(2) +

						"\t" + rs.getString(3) +

						"\t" + rs.getString(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}