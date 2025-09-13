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
public class Update extends Koneksi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Input kolom yang ingin diubah: ");
            String bunga = scan.nextLine();
            System.out.println("Input data yang ingin diubah: ");
            String bunga1 = scan.nextLine();
            System.out.println("Input nama kolom yang dijadikan acuan untuk diubah: ");
            String bunga2 = scan.nextLine();
            System.out.println("Input data pada kolom yang dijadikan acuan untuk diubah: ");
            String bunga3 = scan.nextLine();

            String QUERY = "UPDATE tokobunga SET " + bunga + "='" + bunga1
                    + "' WHERE " + bunga2 + "='" + bunga3 + "';";
            try {
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(QUERY);

                System.out.println("Data telah berhasil diubah");
            } catch (SQLException ex) {
                Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Apakah anda ingin mengubah data lagi? (y/n): ");
            char jawab= scan.next().toLowerCase().charAt(0);
            scan.nextLine();
            switch(jawab){
                case 'y':
                    break;
                case 'n':
                    System.out.println("Kembali ke menu utama");
                    return;
                default:
                    System.out.println("Input tidak valid, kembali ke menu utama");
                    return;
            }
        }
    }
}
