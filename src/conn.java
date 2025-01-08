import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conn {
    Connection c;
    Statement s;

    public conn() {
        try {
            
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "yourpassword");
            s = c.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
