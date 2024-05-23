/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan8_9;

/**
 *
 * @author Yayas
 */
import java.util.Scanner;

import java.util.Scanner;

public class TesSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan sisi-sisi segitiga
        System.out.print("Masukkan sisi1: ");
        double sisi1 = input.nextDouble();
        System.out.print("Masukkan sisi2: ");
        double sisi2 = input.nextDouble();
        System.out.print("Masukkan sisi3: ");
        double sisi3 = input.nextDouble();

        // Memasukkan warna
        System.out.print("Masukkan warna: ");
        String warna = input.next();

        // Memasukkan nilai Boolean untuk menunjukkan apakah segitiga terisi
        System.out.print("Apakah segitiga terisi (true/false)? ");
        boolean diisi = input.nextBoolean();

        // Membuat objek Segitiga dengan sisi-sisi yang dimasukkan
        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
        segitiga.setWarna(warna);
        segitiga.setDiisi(diisi);

        // Menampilkan luas, keliling, warna, dan apakah segitiga terisi atau tidak
        System.out.println("Luas segitiga: " + segitiga.getArea());
        System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
        System.out.println("Warna segitiga: " + segitiga.getWarna());
        System.out.println("Apakah segitiga terisi: " + segitiga.isDiisi());
        System.out.println(segitiga.toString());

        input.close();
    }
}
