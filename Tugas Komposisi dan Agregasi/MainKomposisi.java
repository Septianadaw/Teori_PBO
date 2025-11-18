/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoripbo;

public class MainKomposisi {
    public static void main(String[] args) {
        Rumah rumah = new Rumah(3);

        rumah.tambahKamar(new Kamar("Kamar Tidur Utama"));
        rumah.tambahKamar(new Kamar("Kamar Anak"));
        rumah.tambahKamar(new Kamar("Kamar Tamu"));

        rumah.infoRumah();
    }
}





