package memo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

public class MemoDAO {
	static final String URL =  "jdbc:mysql://localhost/memo?useSSL=false";
	static final String USER = "java";
	static final String PASS = "pass";

	public ArrayList<Memo> findAll() {

		ArrayList<Memo> list = new ArrayList<>();

		try (Connection con = DriverManager.getConnection(URL,USER,PASS);){

			String sql = "SELECT * FROM memo";
			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int mid = rs.getInt("mid");
				String title = rs.getString("title");
				String body = rs.getString("body");
				Timestamp utime = rs.getTimestamp("utime");

				Memo m = new Memo(mid,title,body,utime);
				list.add(m);
			}

			stmt.close();

		} catch (SQLException e) {
			System.out.println("findAllエラー:" + e.getMessage());
		}
		return list;
	}

	public Memo findByMid(int mid) {
		Memo m = null;
		try (Connection con = DriverManager.getConnection(URL,USER,PASS);){

			String sql = "SELECT * FROM memo WHERE mid=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, mid);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				int mid2 = rs.getInt("mid");
				String title = rs.getString("title");
				String body = rs.getString("body");
				Timestamp utime = rs.getTimestamp("utime");

				m = new Memo(mid2,title,body,utime);
			}

			stmt.close();

		} catch (SQLException e) {
			System.out.println("findByPostidエラー:" + e.getMessage());
		}
		return m;
	}

}
