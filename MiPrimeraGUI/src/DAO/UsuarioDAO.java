package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.Usuario;

public class UsuarioDAO extends AbstractDAO {

	public void mostrarUsuarios() {

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");

			while (rs.next()) {
				
				System.out.println(rs.getString("Username") + "\t" + rs.getString("Password"));
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public List<Usuario> getAllUsuarios() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");

			while (rs.next()) {
				String username = rs.getString("Username");
				String password = rs.getString("Password");
				Usuario u = new Usuario(username,  password);
				usuarios.add(u);
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return usuarios;
	}

	public boolean comprobarUsername(String username) {

		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios where username = '" + username + "';");

			// rs.next() devuelve true si hay un usuario con ese username y false en caso
			// contrario.
			return rs.next();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			// En caso error.
			return false;
		}
	}
	
	public void registrarUsuario(Usuario u) {
		String sql = "INSERT INTO USUARIOS VALUES (?,?);";
		
		PreparedStatement preparedStatement;
		try {
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, u.getUsername());
			preparedStatement.setString(2, u.getPassword());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}       
		
	}
}
