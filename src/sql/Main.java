package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/ajay";
        String user = "root";
        String pass = "root";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,pass);
            String insertsql = "INSERT INTO employees (name,age) VALUES ('Balaji',25);";
            try (PreparedStatement insertStmt = conn.prepareStatement(insertsql)){
                insertStmt.executeUpdate();
                System.out.println("Executed Successfully");
            }
            catch (Exception e){
                System.out.println(e);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
 }
}
}