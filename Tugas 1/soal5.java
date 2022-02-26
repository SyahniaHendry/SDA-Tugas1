package sda.tugas1;

import java.util.ArrayList;

public class soal5 {
    public static void main(String[] args) {
        // Nomor 5 [remove]
      ArrayList<String> nama = new ArrayList<String>();
      nama.add("N");
      nama.add("D");
      nama.add("R");
      nama.add("Y");
      nama.remove(0);
      System.out.println("Hilangkan indeks(0) maka hasilnya adalah " + nama);
      nama.remove(2);
      System.out.println("Hilangkan indeks(2) setelah menghilangkan indeks(0) maka bentuknya menjadi " + nama);
      nama.remove(3);
      System.out.println("Hilangkan indeks(3) akan menampilkan bentuk " + nama);
      
    }
    
}
