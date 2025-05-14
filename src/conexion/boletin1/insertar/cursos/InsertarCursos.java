package conexion.boletin1.insertar.cursos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.boletin1.constantes.Constantes;

public class InsertarCursos {

	public static void main(String[] args) {
		
		try (Connection con = DriverManager.getConnection(Constantes.URL, Constantes.USUARIO, Constantes.PASSWORD)) {

			Statement st = con.createStatement();

			String rs1 = "INSERT INTO cursos (nombre, descripcion, año_escolar) VALUES ('Historia 1º.', 'Curso de historia básica para primer año', 2025)";
			
			String rs2 = "INSERT INTO cursos (nombre, descripcion, año_escolar) VALUES ('Biología 1º.', 'Curso de biologia básica para primer año', 2025)";
			
			String rs3 = "INSERT INTO cursos (nombre, descripcion, año_escolar) VALUES ('Educación Física 1º.', 'Curso de educacion fisica básica para primer año', 2025)";
			
			String rs4 = "INSERT INTO cursos (nombre, descripcion, año_escolar) VALUES ('Música 1º.', 'Curso de musica básica para primer año', 2025)";
			
			String rs5 = "INSERT INTO cursos (nombre, descripcion, año_escolar) VALUES ('Tecnología 1º.', 'Curso de tecnologia básica para primer año', 2025)";

			st.executeUpdate(rs1);
			st.executeUpdate(rs2);
			st.executeUpdate(rs3);
			st.executeUpdate(rs4);
			st.executeUpdate(rs5);

//			int filasAfectadas = statement.executeUpdate(sql);
//
//            // Imprimir el número de filas afectadas
//            System.out.println("Filas afectadas: " + filasAfectadas);

		} catch (SQLException e) {

			System.out.println("Error con la base de datos: " + e.getMessage());
		}

	}

}
