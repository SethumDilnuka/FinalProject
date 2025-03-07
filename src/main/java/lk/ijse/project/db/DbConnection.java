package lk.ijse.project.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static DbConnection dbConnection;
    private Connection connection;

    private DbConnection () throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/fruityFizz",
                "root",
                "12345678"
        );
    }
    public static DbConnection getInstance() throws SQLException {
        return (dbConnection == null) ? dbConnection = new DbConnection():dbConnection;
    }
    public Connection getConnection(){
        return connection;
    }
}
