package course.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {

	public static Connection buildConnection() throws Exception{
		String URL = "jdbc:mysql://localhost:3306/cdac";
		String UID="root";
		String PWD="root";
		Connection dbConnection = DriverManager.getConnection(URL, UID, PWD);
		 return dbConnection;
		
	}

}
