/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoBunga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Huawei
 */
public class Koneksi {

    protected static final String DB_URL = "jdbc:postgresql://localhost:5432/DB_PBO_P4";
    protected static final String USER = "postgres";
    protected static final String PASS = "1234";

    protected Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
