package org.learning.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/nation";
    String user = "root";
    String password = "rootpassword";

    try(Connection con = DriverManager.getConnection(url,user,password) ){
        System.out.println(con.getCatalog());
    }catch (SQLException e){
        System.out.println("unable to connect");
    };
}
}
