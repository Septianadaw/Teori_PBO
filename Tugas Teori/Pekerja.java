/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pboteori;

/**
 *
 * @author ASUS
 */
public class Pekerja extends Manusia {
    private double gaji;   // atribut khusus untuk pekerja, di-enkapsulasi

    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); // memanggil konstruktor kelas induk
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        if (gaji < 0) {
            throw new IllegalArgumentException("Gaji tidak boleh negatif");
        }
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return "Nama     : " + getNama() + "\n" +   // nama via getter karena private
               "Usia     : " + usia + "\n" +       // usia dapat diakses langsung (protected)
               "Pekerjaan: " + pekerjaan + "\n" +  // pekerjaan public -> akses langsung
               "Gaji     : " + gaji;
    }
}