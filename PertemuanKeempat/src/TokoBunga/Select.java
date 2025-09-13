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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author Huawei
 */
public class Select extends Koneksi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Berikut data tabel Toko Bunga: ");
        String QUERY = "SELECT * FROM tokobunga";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
            {
                while (rs.next()) {
                    System.out.println(String.valueOf(rs.getObject(1)) + " | "
                            + String.valueOf(rs.getObject(2)) + " | "
                            + String.valueOf(rs.getObject(3)) + " | "
                            + String.valueOf(rs.getObject(4)) + " | "
                            + String.valueOf(rs.getObject(5)) + " | "
                            + String.valueOf(rs.getObject(6)) + " | "
                            + String.valueOf(rs.getObject(7)));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Apakah anda ingin kembali ke menu? (y/n): ");
        char jawab = scan.next().toLowerCase().charAt(0);

        scan.nextLine();
        switch (jawab) {
            case 'y':
                System.out.println("Kembali ke menu utama");
                break;
            case 'n':
                System.out.println("Tidak kembali ke menu utama");
                System.exit(0);
                break;
            default:
                System.out.println("Input salah, silahkan cobaa lagi");
                break;
        }
    }
}
