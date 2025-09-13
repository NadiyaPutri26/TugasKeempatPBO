/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoBunga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author Huawei
 */
public class Insert extends Koneksi {

    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Input Id Bunga: ");
            String bunga = scan.nextLine();
            System.out.println("Input Nama Bunga: ");
            String bunga1 = scan.nextLine();
            System.out.println("Input Kategori Bunga: ");
            String bunga2 = scan.nextLine();
            System.out.println("Input Deskripsi Produk: ");
            String bunga3 = scan.nextLine();
            System.out.println("Input Harga: ");
            int bunga4 = scan.nextInt();
            scan.nextLine();
            System.out.println("Input Stok: ");
            int bunga5 = scan.nextInt();
            scan.nextLine();
            System.out.println("Input Ukuran: ");
            String bunga6 = scan.nextLine();

            String QUERY = "INSERT INTO tokobunga (idbunga, namabunga, kategoribunga"
                    + ", deskripsiproduk, harga, stok, ukuran) VALUES('" + bunga + "','"
                    + bunga1 + "','" + bunga2 + "','" + bunga3 + "','" + bunga4 + "','"
                    + bunga5 + "','" + bunga6 + "')";
            try {
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(QUERY);
                System.out.println("Data berhasil ditambahkan!");
            } catch (SQLException ex) {
                Logger.getLogger(Create.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Apakah anda ingin menambah data lagi? (y/n): ");
            char jawab = scan.next().toLowerCase().charAt(0);
            scan.nextLine();
            switch (jawab) {
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
