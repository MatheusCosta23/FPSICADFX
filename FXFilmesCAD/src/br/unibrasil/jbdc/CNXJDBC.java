package br.unibrasil.jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CNXJDBC {
	
	private static final String Classe_Drive = "org.hsqldb.jdbcDriver";
	private static Connection cone = null;
	
	private static String user = "SA";
	private static String password = "";
	private static String PathBase = "C:\\Users\\Matheus Costa\\Desktop\\FilmesCAD\\util\\FilmesBase";
	private static String URL = "jdbc:hsqldb:file:" + PathBase + ";shutdown=true;hsqldb..write_delay=false; ";
	
	public static Connection Conecta()
	{
		if(cone == null)
		{
		try {
			Class.forName(Classe_Drive);
				cone = DriverManager.getConnection(URL, user, password);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		}
		
		return cone;
	}
	
	
	public static void FecharCone()
	{
		
		try {
			cone.close();
			cone = null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	
	
	
	
	
	
	
}
