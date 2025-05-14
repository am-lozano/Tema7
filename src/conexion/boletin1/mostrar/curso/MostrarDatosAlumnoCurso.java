package conexion.boletin1.mostrar.curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.boletin1.constantes.Constantes;

public class MostrarDatosAlumnoCurso {

	public static void main(String[] args) {

		// Realiza una aplicación que muestre el nombre y fecha de nacimiento de los alumnos de un curso introducido por teclado.
		
		try (Connection con = DriverManager.getConnection(Constantes.URL, Constantes.USUARIO, Constantes.PASSWORD)) {

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
