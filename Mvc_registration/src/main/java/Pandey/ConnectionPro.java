package Pandey;

import java.sql.*;

public class ConnectionPro {
	
	 private static Connection con;
	    
	    public static Connection getConnection(){
	        try{
	            Class.forName("com.mysql.jdbc.Driver");
	            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_project","root","Pandey@12345");
	            
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        return con;
	    }
	}
