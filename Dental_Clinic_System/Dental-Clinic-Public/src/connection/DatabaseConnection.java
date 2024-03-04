
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;

/**
 *
 * @author Sanket Manne  Github - https://github.com/SanketsMane 
 */
public class DatabaseConnection {

    //TODO: Please change this as your mysql xammp setttings. Thank you
    private static final String DATABASE_CONNECTION = "jdbc:mysql://localhost:3306/dentalclinic?serverTimezone=" + TimeZone.getDefault().getID();
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "Pass@123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_CONNECTION, DATABASE_USERNAME, DATABASE_PASSWORD);
    }

}
