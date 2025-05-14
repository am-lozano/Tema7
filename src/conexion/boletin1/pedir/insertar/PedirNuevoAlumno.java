package conexion.boletin1.pedir.insertar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import conexion.boletin1.constantes.Constantes;

public class PedirNuevoAlumno {

	public static void main(String[] args) {

		// Realiza una aplicación que solicite todos los datos de un alumno y lo inserte
		// en la base de datos.

		String nombre, apellido, fechaNacimiento, email, telefono;

		Scanner sc = new Scanner(System.in);

		try (Connection con = DriverManager.getConnection(Constantes.URL, Constantes.USUARIO, Constantes.PASSWORD)) {

			Statement st = con.createStatement();

			System.out.println("Introduzca el nombre del alumno:");
			nombre = sc.nextLine();

			System.out.println("Introduzca el apellido del alumno:");
			apellido = sc.nextLine();

			System.out.println("Introduzca la fecha de nacimiento del alumno (yy-mm-dd):");
			fechaNacimiento = sc.nextLine();

			System.out.println("Introduzca el email del alumno:");
			email = sc.nextLine();

			System.out.println("Introduzca el telefono del alumno:");
			telefono = sc.nextLine();

			String rs1 = "INSERT INTO estudiantes (nombre, apellido, fecha_nacimiento, email, telefono) VALUES ('"
					+ nombre + "', '" + apellido + "', '" + fechaNacimiento + "', '" + email + "', '" + telefono + "')";

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
