package sk.kosickaakademia.kovalcik.chat;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://itsovy.sk:3306/chat2021?useSSL=false&serverTimezone=UTC";
        String user = "mysqluser";
        String pass = "Kosice2021!";


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to database: " + jdbcUrl);
            Connection connection = DriverManager.getConnection(jdbcUrl, user, pass);
            System.out.println("Connection successful!");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
