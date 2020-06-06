package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;



public class DataConnection
{


    static Connection connection;
    static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static String DATABASE_URL = "jdbc:mysql://localhost:3306/Airline";
    static String userName = "root"; //user credentials sored in UserPass
    static String password = "shlo";



    public static void connect()
    {
        try
        {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, userName, password);
            System.out.println("Database Connection Success");
        }

        catch (Exception e)
        {
            e.printStackTrace();

            System.out.println("Problem with Database Connection");
        }
    }



    public static Connection getConnection() {
        return connection;
    }

}