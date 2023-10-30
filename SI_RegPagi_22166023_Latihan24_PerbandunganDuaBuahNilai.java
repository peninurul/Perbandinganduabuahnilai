/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166023_latihan24_perbandungan.dua.buah.nilai;
import java.util.Scanner;
/**
 *
 * @author user
 * NAMA : Peni Nurul Fauzah
 * KELAS : PBO24
 * NIM : 22166023
 * DESKRIPSI PROGRAM : Perbandingan Dua Buah Nilai
 */
public class SI_RegPagi_22166023_Latihan24_PerbandunganDuaBuahNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulangi;
        
        System.out.println("============Program Perbandingan Nilai===========");

        do {
            System.out.print("Masukkan nilai pertama: ");
            double nilai1 = input.nextDouble();
            System.out.print("Masukkan nilai kedua: ");
            double nilai2 = input.nextDouble();

            if (nilai1 < nilai2) {
                System.out.println("Hasil : " + nilai1 + " Lebih kecil dari " + nilai2);
            } else if (nilai1 > nilai2) {
                System.out.println("Hasil : " + nilai1 + " Lebih besar dari " + nilai2);
            } else {
                System.out.println("Hasil : " + nilai1 + " Sama dengan " + nilai2);
            }

            System.out.println();
            System.out.print("Ulangi perbandingan? (Ya/Tidak): ");
            ulangi = input.next().charAt(0);

        } while (ulangi == 'y' || ulangi == 'Y');
    }
    
}
