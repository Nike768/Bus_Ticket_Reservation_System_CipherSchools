package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCreate {

    public static Connection GetConnection(String url, String userName, String pass) throws SQLException {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jabtwo","postgres","root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            conn.close();
        }


        return conn;
    }
}
