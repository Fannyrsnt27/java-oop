package sia.app.mahasiswa.data;

import sia.app.abstracts.person;

public class mahasiswa extends person{
     public String nim;
     public String nama;
     public String Phonenumber;

     public mahasiswa(String nim, String nama, String gender, String Phonenumber) {
        this.nim = nim;
        this.nama = nama;
        this.gender = gender;
        this.Phonenumber = Phonenumber;
    
     }
    
}
