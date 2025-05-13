package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.boletin1.constantes.Constantes;

public class ConexionBD {

	public static void main(String[] args) {
		
//		String url = "jdbc:mysql://localhost/institutodb";
//		String usuario = "root";
//		String pas = "RootUser132.";
		
		try(Connection con = DriverManager.getConnection(Constantes.URL, Constantes.USUARIO, Constantes.PASSWORD)) {
			
			System.out.println("La conexion ha sido un exito");
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select * from estudiantes");
			
			while (rs.next()) {
				
				System.out.println(rs.getString(1) + " " + rs.getString(2));
				
			}
			
		} catch (SQLException e) {
			
			System.out.println("Error con la base de datos: " + e.getMessage());
			
		}

	}

}
