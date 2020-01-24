/**
 * 
 */
package com.odiazca.net;

import java.sql.Connection;

/**
 * @author Victimario
 *
 */
public class Inicio {

	/** 
	 * Metodo de incio
	 * @param args
	 */
	public static void main(String[] args) {

		Conexion conn = new Conexion();	
		
		try {
			
			Connection cnx = conn.get_connection();
			
		} catch( Exception sql) {
			sql.printStackTrace();
			
		}
		
		
		
		System.out.println("************************************");
		System.out.println("Hola Mundo con persistencia");
		System.out.println("************************************");

	}

}
