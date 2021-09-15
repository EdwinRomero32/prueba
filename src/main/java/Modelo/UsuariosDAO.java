package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.protocol.Resultset;

public class UsuariosDAO{
	 String driver;
     String usu;
     String cla;
     String ruta;
     
   public UsuariosDAO() {
	   driver = "com.mysql.jdbc.Driver";
	   ruta = "jdbc:mysql://localhost:3306/tienda_generica";
	   usu = "root";
	   cla = "NOeres56";
	   
   }
	
	public int validarusuario (String usuario, String pass){
		
		
			
		  PreparedStatement ps = null;
	      ResultSet rs = null;
	      Connection con;
	      int nivel = 0;
	      String consulta = "SELECT rol_usuario FROM usuarios WHERE usuario = '"+usuario+"' and pass_usuario = '"+pass+"'";
	      try{
	    	  Class.forName(this.driver);
	    	  con = DriverManager.getConnection(this.ruta,this.usu,this.cla);
	    	  
	            ps = con.prepareStatement(consulta);
	            rs = ps.executeQuery();
	           while (rs.next()){
	        	   nivel = rs.getInt(1);
	                
	            }
	           con.close();
	           
	        }catch (Exception e){
	            e.printStackTrace();
	           
	 
		
	}
		return nivel;
	
	
	}
}


