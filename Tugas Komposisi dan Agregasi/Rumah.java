/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoripbo;

class Rumah {
    private Kamar[] daftarKamar;
    private int jumlahKamar;

    public Rumah(int kapasitas) {
        daftarKamar = new Kamar[kapasitas];
        jumlahKamar = 0;
    }

    public void tambahKamar(Kamar kamar) {
        if (jumlahKamar < daftarKamar.length) {
            daftarKamar[jumlahKamar] = kamar;
            jumlahKamar++;
        } else {
            System.out.println("Kapasitas kamar penuh.");
        }
    }

    public void infoRumah() {
        System.out.println("Daftar Kamar di Rumah: ");
        for (int i = 0; i < jumlahKamar; i++) {
            daftarKamar[i].infoKamar();
        }
    }
}



