/**
 * 
 */
package com.odiazca.net;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


/**
 * @author Victimario
 *Clase para devolver conexion
 */
public class Conexion {
	
	
	public Connection get_connection() {
	Connection connection = null;
	
	try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app?serverTimezone=UTC","root","");
		
		if( connection != null) {
				System.out.println("Conexion exitosa");
		}
	} catch (SQLException eSql) {
		eSql.printStackTrace();
	}
			return connection;
	}
	
	
}
