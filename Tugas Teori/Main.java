/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pboteori;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Pekerja pekerja1 = new Pekerja("Budi", 25, "Programmer", 7000000);

        System.out.println("== Data Pekerja Awal ==");
        System.out.println(pekerja1.toString());

        // ubah data menggunakan setter
        pekerja1.setNama("Andi");
        pekerja1.setNama("");
        pekerja1.setGaji(8000000);

        System.out.println("\n== Data Pekerja Setelah Diubah ==");
        System.out.println(pekerja1.toString());

        // Contoh akses langsung yang valid / tidak valid:
        pekerja1.pekerjaan = "Senior Programmer"; // valid karena pekerjaan public
        // pekerja1.nama = "Cici"; // ERROR jika di-uncomment: nama is private in Manusia
        // pekerja1.gaji = 10000000; // ERROR: gaji is private in Pekerja

        System.out.println("\n== Setelah Ubah pekerjaan langsung ==");
        System.out.println(pekerja1.toString());
    }
}
