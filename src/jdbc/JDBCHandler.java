package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCHandler {

    private static Connection connection;

    public JDBCHandler() {
        connection = connect();
    }

    private static Connection connect() {
        Connection connection = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:FontFinder.db";
            // create a connection to the database
            connection = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public static Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error closing connection!");
        }
    }
}
