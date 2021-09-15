package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
	private String basedatos = "tienda_generica";
    private String usuario = "root";
    private String pass = "NOeres56";
    private String ruta = "jdbc:mysql://localhost:3306/" + basedatos;
    private Connection con = null;

    public Connection getconexion() throws SQLException {
        try{

            con = DriverManager.getConnection(this.ruta,this.usuario, this.pass);

        }catch (SQLException e){
            System.err.println(e);

        }
        return con;
    }

}
