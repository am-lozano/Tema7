package conexion.boletin1.insertar.notas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.boletin1.constantes.Constantes;

public class InsertarNotas {

	public static void main(String[] args) {

		// Añade notas a los distintos alumnos de la base de datos para las distintas asignaturas.
		
		try (Connection con = DriverManager.getConnection(Constantes.URL, Constantes.USUARIO, Constantes.PASSWORD)) {

			Statement st = con.createStatement();

			String rs1 = "INSERT INTO calificaciones (id_estudiante, id_curso, id_profesor, tipo_evaluacion, nota, fecha_evaluacion) VALUES (2, 2, 2, 'Trabajo', 8.0, '2025-03-12')";

			String rs2 = "INSERT INTO calificaciones (id_estudiante, id_curso, id_profesor, tipo_evaluacion, nota, fecha_evaluacion) VALUES (3, 1, 1, 'Examen', 10.0, '2025-03-20')";

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
