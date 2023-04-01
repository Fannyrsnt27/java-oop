package sia.app.mahasiswa.application;

import sia.app.mahasiswa.data.mahasiswa;
public class mahasiswapp {
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa("1111","budi", "laki-laki", "03839495");
        System.out.println(mhs.nim);
        System.out.println(mhs.nama);
        System.out.println(mhs.gender);
        System.out.println(mhs.Phonenumber);
        
    }
    
}
