package conectores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ejercicio_6 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/prueba_1" + "?useUnicode=true"+ "&serverTimezone=Europe/Madrid";
	    String nombredriver ="com.mysql.cj.jdbc.Driver";
	    
	    try {
			Class.forName(nombredriver);
			Connection con = DriverManager.getConnection(url, "root", "usuario1usuario");
			
			PreparedStatement stmt = con.prepareStatement("Select nombre_producto, precio from productos where id=?");
			
			stmt.setInt(1, 1);
			
			stmt.execute();
			
			ResultSet rset = stmt.executeQuery();
			
			rset.next();
			
			System.out.println("Nombre: "+rset.getString(1)+", Precio: "+rset.getFloat(2));
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      

	}

}
