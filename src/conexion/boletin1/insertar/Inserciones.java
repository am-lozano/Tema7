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

			// cambia executeUpdate 
			String rs1 = "INSERT INTO calificaciones VALUES (4, 1, 1, 'Examen', 5.0, '2025-03-10')";
			
			String rs2 = "INSERT INTO cursoprofesor VALUES (3, 3)";
			
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
