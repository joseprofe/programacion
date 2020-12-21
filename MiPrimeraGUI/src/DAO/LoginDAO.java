package DAO;

import java.sql.*;

public class LoginDAO extends AbstractDAO{

	public boolean login(String username, String password) {

		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM usuarios " + "WHERE username = '" + username + "'" + " AND password = '"
					+ password + "'";
			ResultSet rs = stmt.executeQuery(sql);

			return rs.next();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		// Esto solo ocurre si peta la BD.
		return false;

	}
}
