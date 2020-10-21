package conectores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/prueba_1" + "?useUnicode=true"+ "&serverTimezone=Europe/Madrid";
	    String nombredriver ="com.mysql.cj.jdbc.Driver";
	    try {
	      
	      Class.forName(nombredriver);
	      Connection con = DriverManager.getConnection(url, "root", "usuario1usuario");
	      Statement stmt= con.createStatement();
	      Statement stmt2 = con.createStatement();
	       String sql = "select * from productos";
	       String sql2 = "select MAX(precio) from productos";
	       stmt.execute(sql);
	       
	       stmt2.execute(sql2);
	       
	       ResultSet rSet = stmt.executeQuery(sql);
	       
	       ResultSet rset2 = stmt2.executeQuery(sql2);
	            
	        while(rSet.next()==true) {

	         String id = rSet.getString(1);
	         String nombre = rSet.getString(2);
	         String precio = rSet.getString(3);
	         String id_categoria = rSet.getString(4);
	         System.out.println(id+" "+nombre+" "+precio+" "+id_categoria);
	                
	        
	            }
	        
	        while(rset2.next()==true) {

		         String precio_mas_caro = rset2.getString(1);

		         System.out.println("Precio más caro: "+precio_mas_caro);
		                
		        
		            }
		
		//Establecemos conexión con DriverManager
		
		
		//Creamos sentencia
		
		
		//Ejecutamos la consulta
		
		
		//Imprimimos los resultados
		
		
		//Cerramos los recursos utilizados
	    }
	    catch(ClassNotFoundException e) {
	    	
	    	e.printStackTrace();
	    	
	    }
	    catch(SQLException e) {
	    	
	    	e.printStackTrace();
	    	
	    } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
