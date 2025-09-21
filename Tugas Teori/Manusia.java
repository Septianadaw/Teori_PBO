/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pboteori;

/**
 *
 * @author ASUS
 */
public class Manusia {
    private String nama;        // enkapsulasi: hanya dapat diakses lewat getter/setter
    protected int usia;         // dapat diakses oleh subclass dan kelas di package sama
    public String pekerjaan;    // dapat diakses dari mana saja

    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.nama = nama;
    }
}
