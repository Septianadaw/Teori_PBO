/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoripbo;

import java.util.ArrayList;
import java.util.List;

class Tim {
    private String namaTim;
    private List<Pemain> pemainList;

    public Tim(String namaTim) {
        this.namaTim = namaTim;
        pemainList = new ArrayList<>();
    }

    public void tambahPemain(Pemain pemain) {
        pemainList.add(pemain);
    }

    public void infoTim() {
        System.out.println("Nama Tim: " + namaTim);
        for (Pemain p : pemainList) {
            p.infoPemain();
        }
    }
}

