/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoBunga;

import java.util.Scanner;

/**
 *
 * @author Huawei
 */
public class Menu {

    Scanner scan = new Scanner(System.in);

    public void menu() {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n=========MENU UTAMA=========");
            System.out.println("0. Keluar");
            System.out.println("1. Input Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Update Data");
            System.out.println("PILIHAN > ");

            try {
                int pilihan = scan.nextInt();
                scan.nextLine();

                switch (pilihan) {
                    case 0:
                        isRunning = false;
                        System.out.println("Terimakasih! Program selesai");
                        break;
                    case 1:
                        Insert.main(null);
                        break;
                    case 2:
                        Select.main(null);
                        break;
                    case 3:
                        Delete.main(null);
                        break;
                    case 4:
                        Update.main(null);
                        break;
                    default:
                        System.out.println("Pilihan salah! Coba lagi!");
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid!");
                scan.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        Menu m = new Menu();
        m.menu();
    }
}
