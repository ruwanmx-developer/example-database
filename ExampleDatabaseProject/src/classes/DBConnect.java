package classes;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnect {
    public Connection databaseConn() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db?autoReconnect=false&useSSL=false", "root", "");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return con;
    }
}
