package conexion.boletin1.actualizar.ana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.boletin1.constantes.Constantes;

public class ActualizarNotaAna {

	public static void main(String[] args) {
		
		try (Connection con = DriverManager.getConnection(Constantes.URL, Constantes.USUARIO, Constantes.PASSWORD)) {

			Statement st = con.createStatement();

			String rs1 = "UPDATE calificaciones SET nota = nota + 1 WHERE id_estudiante = 1 AND id_profesor = 1";


			st.executeUpdate(rs1);

//			int filasAfectadas = statement.executeUpdate(sql);
//
//            // Imprimir el número de filas afectadas
//            System.out.println("Filas afectadas: " + filasAfectadas);

		} catch (SQLException e) {

			System.out.println("Error con la base de datos: " + e.getMessage());
		}

	}

}
