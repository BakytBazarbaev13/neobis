package com.company.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnJdbc {


     public static Connection getConnection() throws SQLException {
         String url = "jdbc:mysql://localhost:3306/service";
         String user = "root";
         String password = "password";
             Connection connection = DriverManager.getConnection(url, user, password);

         return connection;
     }
}
