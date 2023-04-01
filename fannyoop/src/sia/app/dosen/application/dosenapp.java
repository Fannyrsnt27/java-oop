package sia.app.dosen.application;

import sia.app.dosen.data.dosen;

public class dosenapp {
    public static void main(String[] args) {
        dosen dosen = new dosen();
        dosen.nama = "Fanny";
        dosen.gender = "Perempuan";
        dosen.setUmur(21);

        System.out.println(dosen.nama);
        System.out.println(dosen.gender);
        System.out.println(dosen.getUmur());


    }
}
