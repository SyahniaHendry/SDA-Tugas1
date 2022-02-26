package sda.tugas1;

import java.util.ArrayList;

public class soal6 {
    public static void main(String[] args) {
        // Nomor 6 [add]
      ArrayList<String> nama = new ArrayList<String>();
      nama.add("N");
      nama.add("D");
      nama.add("R");
      nama.add("Y");

      nama.add(0,"E");
      System.out.println("Hasil setelah ditambahkan E pada indeks(0) = " + nama);
      nama.add(2,"F");
      System.out.println("Hasil setelah ditambahkan F pada indeks(2) = " + nama);
      nama.add(3,"G");
      System.out.println("Hasil setelah ditambahkan G pada indeks(3) = " + nama);
      nama.add(4,"H");
      System.out.println("Hasil setelah ditambahkan H pada indeks(4) = " + nama);
      nama.add(6,"H");
      System.out.println("Hasil setelah ditambahkan H pada indeks(6) = " + nama);
      nama.add(-3,"J");
      System.out.println("Hasil setelah ditambahkan J pada indeks(-3) = " + nama);
    }   
}
