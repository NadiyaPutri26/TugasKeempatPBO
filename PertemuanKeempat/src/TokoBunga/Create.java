/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TokoBunga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Huawei
 */
public class Create extends Koneksi {

    static final String QUERY = "CREATE TABLE tokobunga ("
            + "idbunga CHAR (3) PRIMARY KEY, "
            + "namabunga VARCHAR (20), "
            + "kategoribunga VARCHAR (20), "
            + "deskripsiproduk VARCHAR (255), "
            + "harga INT, "
            + "stok INT, "
            + "ukuran VARCHAR (10)"
            + ");";

    public static void main(String[] args) throws SQLException {
        try {
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); Statement stmt = conn.createStatement(); stmt.executeUpdate(QUERY);
        } catch (SQLException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
