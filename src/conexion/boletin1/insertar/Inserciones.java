package conexion.boletin1.insertar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.boletin1.constantes.Constantes;

public class Inserciones {

	public static void main(String[] args) {

		// Realiza diversas inserciones en las distintas tablas de la base de datos
		// institutodb.

		try (Connection con = DriverManager.getConnection(Constantes.URL, Constantes.USUARIO, Constantes.PASSWORD)) {

			Statement st = con.createStatement();

			String rs1 = "INSERT INTO cursos (nombre, descripcion, año_escolar) VALUES ('Ingles 1º', 'Curso de ingles básico para primer año', 2025)";

			String rs2 = "INSERT INTO estudiantes (nombre, apellido, fecha_nacimiento, email, telefono) VALUES ('Pablo', 'Garcia', '2006-10-05', 'pablo.garcia@email.com', '612345789')";

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
