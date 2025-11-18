/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoripbo;

public class MainAgregasi {
    public static void main(String[] args) {
        Tim tim = new Tim("Tim Futsal A");

        Pemain p1 = new Pemain("Faezya");
        Pemain p2 = new Pemain("Fadhil");
        Pemain p3 = new Pemain("Reza");

        tim.tambahPemain(p1);
        tim.tambahPemain(p2);
        tim.tambahPemain(p3);

        tim.infoTim();
    }
}

