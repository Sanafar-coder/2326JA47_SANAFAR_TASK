import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
    public static Connection connect() throws Exception {
        String url = "jdbc:mysql://localhost:3306/student_db";
        String user = "root";
        String password = "sachin1610"; 

        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, password);
    }
}
