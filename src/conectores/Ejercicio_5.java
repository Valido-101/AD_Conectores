package conectores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio_5 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/prueba_1" + "?useUnicode=true"+ "&serverTimezone=Europe/Madrid";
	    String nombredriver ="com.mysql.cj.jdbc.Driver";
	    
	    String nullable; 
	    
	    try {
		      
		      Class.forName(nombredriver);
		      Connection con = DriverManager.getConnection(url, "root", "usuario1usuario");
		      Statement stmt= con.createStatement();
		      
		      stmt.execute("Select * from productos");
		      
		      ResultSet rSet = stmt.executeQuery("Select * from productos");
		      
		      ResultSetMetaData rSetmd = rSet.getMetaData();
		      
		      System.out.println("Número de columnas: "+rSetmd.getColumnCount()+"\n");
		      
		      for(int x=1 ; x<=rSetmd.getColumnCount() ; x++) 
		      {
		    	  if(rSetmd.isNullable(x)==0) 
		    	  {
		    		  nullable="No";
		    	  }
		    	  else 
		    	  {
		    		  nullable="Sí";
		    	  }
		    	  
		    	  System.out.println("Nombre: "+rSetmd.getColumnName(x)+", Tipo de columna: "+rSetmd.getColumnTypeName(x)+", ¿Puede ser nulo?: "+nullable+", Máximo ancho de la columna: "+rSetmd.getColumnDisplaySize(x));
		      }
		      
		      rSet.close();
		      stmt.close();
		      con.close();
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
