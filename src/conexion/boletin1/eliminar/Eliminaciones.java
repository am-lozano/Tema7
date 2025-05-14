package conexion.boletin1.eliminar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.boletin1.constantes.Constantes;

public class Eliminaciones {

	public static void main(String[] args) {

		// Realiza una eliminación de registro en las distintas tablas de la base de
		// datos institutodb.

		try (Connection con = DriverManager.getConnection(Constantes.URL, Constantes.USUARIO, Constantes.PASSWORD)) {

			Statement st = con.createStatement();

			String rs1 = "DELETE FROM estudiantes WHERE id_estudiante = 4";

			String rs2 = "DELETE FROM cursos WHERE id_curso = 3";

			st.executeUpdate(rs1);
			st.executeUpdate(rs2);

//			int filasAfectadas = statement.executeUpdate(sql);
//
//            // Imprimir el número de filas afectadas
//            System.out.println("Filas afectadas: " + filasAfectadas);

		} catch (SQLException e) {

			System.out.println("Error con la base de datos: " + e.getMessage());
		}

	}

}
