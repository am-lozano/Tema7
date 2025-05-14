package conexion.boletin1.mostrar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.boletin1.constantes.Constantes;

public class MostrarDatosAlumno {

	public static void main(String[] args) {
		
		// Mostrar el nombre y fecha de nacimiento de todos los alumnos.

		try (Connection con = DriverManager.getConnection(Constantes.URL, Constantes.USUARIO, Constantes.PASSWORD)) {

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("select nombre, fecha_nacimiento from estudiantes");

			System.out.println("Nombre\tFecha Nacimiento");
			
			while (rs.next()) {

				System.out.println(rs.getString(1) + "\t" + rs.getString(2));

			}

		} catch (SQLException e) {

			System.out.println("Error con la base de datos: " + e.getMessage());

		}

	}

}
