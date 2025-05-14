package conexion.boletin1.pedir.eliminar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import conexion.boletin1.constantes.Constantes;

public class PedirBorrarAlumno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int id;
		
		try (Connection con = DriverManager.getConnection(Constantes.URL, Constantes.USUARIO, Constantes.PASSWORD)) {

			Statement st = con.createStatement();

			System.out.println("Introduzca el id del alumno a eliminar:");
			id = sc.nextInt();
			
			String rs1 = "DELETE FROM estudiantes WHERE id_estudiante = " + id + "";

			st.executeUpdate(rs1);

//			int filasAfectadas = statement.executeUpdate(sql);
//
//            // Imprimir el número de filas afectadas
//            System.out.println("Filas afectadas: " + filasAfectadas);

		} catch (SQLException e) {

			System.out.println("Error con la base de datos: " + e.getMessage());
		}
		
		sc.close();

	}

}
