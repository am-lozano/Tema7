package conexion.boletin1.actualizar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.boletin1.constantes.Constantes;

public class Actualizaciones {

	public static void main(String[] args) {

		// Realiza diversas actualizaciones en las distintas tablas de la base de datos
		// institutodb.

		try (Connection con = DriverManager.getConnection(Constantes.URL, Constantes.USUARIO, Constantes.PASSWORD)) {

			Statement st = con.createStatement();

			String rs1 = "UPDATE estudiantes SET email = 'pablo.garcia.editado@email.com' WHERE id_estudiante = 4";

			String rs2 = "UPDATE cursos SET nombre = 'Ingles 2º', descripcion = 'Curso de ingles medio para segundo año' WHERE id_curso = 3";
			

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
