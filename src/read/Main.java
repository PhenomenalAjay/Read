package read;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/ajay";
        String user = "root";
        String pass = "root";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
            System.out.println("Name   Age");

            while(rs.next()){
                String name = rs.getString("name");
                String age = rs.getString("age");
                System.out.println(name + "  " + age + " ");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}