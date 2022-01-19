package org.spiral;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        getName();
        System.out.println("punchman");
        System.out.println("sdgsdgvsd");

    }

    public static void getName() {
        String sql = "select * from hero";
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dota2?characterEncoding=utf8", "root", "admin");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}