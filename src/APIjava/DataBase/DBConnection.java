package APIjava.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {

    static final String URL = "jdbc:mysql://localhost:3306/stand" ;

    static final String USER = "root";
    static final String PASS = "";
    
    public static Connection getConnection() {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn = DriverManager.getConnection(URL,USER,PASS);
            System.out.println("Connection to " + conn.getCatalog() + " succeded!");
            return conn;
        } catch (SQLException exc){
            throw new RuntimeException("Error connecting!", exc);
        }
    }   

}
