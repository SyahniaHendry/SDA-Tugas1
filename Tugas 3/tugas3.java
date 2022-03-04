package sda.tugas1;

import java.util.LinkedList;

public class tugas3 {
    public static void main(String[] args) {
        LinkedList <String> nama_mahasiswa = new LinkedList<String>();
        LinkedList <String> no_bp = new LinkedList<String>();
        LinkedList <String> alamat = new LinkedList<String>();

        System.out.println("-----Data Mahasiwa-----");
        System.out.println(" ");
        nama_mahasiswa.add("Syahnia Putri Hendry");
        no_bp.add("2111522020");
        alamat.add("Padang");
        System.out.println("Nama Mahasiswa        : " + nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " + no_bp);
        System.out.println("Alamat Mahsiswa       : " + alamat);
        System.out.println("");

        //menambahkan data mahasiswa
        System.out.println("-----(Penambahan Data Mahasiswa)-----");
        System.out.println(" ");
        nama_mahasiswa.addFirst("Ale Dalena");
        nama_mahasiswa.addLast("Juju Bijun");
        nama_mahasiswa.add(1,"Jannatul Salsabila");
        nama_mahasiswa.add(4,"Vanesa Intana");
        no_bp.add("2111523020");
        no_bp.add("2111521020");
        no_bp.add("2111527020");
        no_bp.add("2111529020");
        alamat.add("Jakarta");
        alamat.add("Bukittinggi");
        alamat.add("Bandung");
        alamat.add("Bali");
        System.out.println("Nama Mahasiswa        : " + nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " + no_bp);
        System.out.println("Alamat Mahasiswa      : " + alamat);
        System.out.println(" ");

        //mengganti data mahasiswa
        System.out.println("-----(Revisi Data Mahasiswa)-----");
        System.out.println(" ");
        nama_mahasiswa.set(0,"Ale Dalena Saputri");
        nama_mahasiswa.set(4,"Vanesa Intani");
        no_bp.set(1,"2111521021");
        alamat.set(2,"Batam");
        System.out.println("Nama Mahasiswa        : " + nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " + no_bp);
        System.out.println("Alamat Mahasiswa      : " + alamat);
        System.out.println(" ");

        //penghapusan data mahasiswa
        System.out.println("-----(Penghapusan Data Mahasiswa)-----");
        System.out.println(" ");
        nama_mahasiswa.removeLast();
        no_bp.removeLast();
        alamat.removeLast();
        System.out.println("Nama Mahasiswa        : " + nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " + no_bp);
        System.out.println("Alamat Mahasiswa      : " + alamat);
        System.out.println(" ");

        //operasi pop dan push
        System.out.println("-----(Pop dan Push Data Mahasiswa)-----");
        System.out.println(" ");
        System.out.println("--POP--");
        nama_mahasiswa.pop();
        no_bp.pop();
        alamat.pop();
        System.out.println("Nama Mahasiswa        : " + nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " + no_bp);
        System.out.println("Alamat Mahasiswa      : " + alamat);
        System.out.println(" ");

        System.out.println("--Push--");
        nama_mahasiswa.push("Ale Dalena");
        no_bp.push("2111522020");
        alamat.push("Padang");
        System.out.println("Nama Mahasiswa        : " + nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " + no_bp);
        System.out.println("Alamat Mahasiswa      : " + alamat);
        System.out.println(" ");

        //mencari data untuk mengetahui posisi indeksnya
        System.out.println("-----(Mencari Posisi Indeks Data Mahasiswa)-----");
        System.out.println(" ");
        System.out.println("Nama Mahasiswa        : Syahnia Putri Hendry");
        System.out.println("Nomor Induk Mahasiswa : 2111525020");
        System.out.println("Alamat Mahasiswa      : Bandung");
        System.out.println(" ");
        System.out.println("--Posisi Indeks--");
        System.out.println("Nama Mahasiswa        : " + nama_mahasiswa.indexOf("Syahnia Putri Hendry"));
        System.out.println("Nomor Induk Mahasiswa : " + no_bp.indexOf("2111525020"));
        System.out.println("Alamat Mahasiswa      : " + alamat.indexOf("Bandung"));
        System.out.println(" ");

        //mengambil data mahasiswa dari posisi indeks
        System.out.println("-----(Mencari Data Mahasiswa dg Posisi Indeks)------");
        System.out.println(" ");
        System.out.println("--Posisi Indeks--");
        System.out.println("Nama Mahasiswa        : 3 ");
        System.out.println("Nomor Induk Mahasiswa : 3 ");
        System.out.println("Alamat Mahasiswa      : 3 ");
        System.out.println(" ");
        System.out.println("--Hasil Pencarian--");
        System.out.println("Nama Mahasiswa        : " + nama_mahasiswa.get(3));
        System.out.println("Nomor Induk Mahasiswa : " + no_bp.get(3));
        System.out.println("Alamat Mahasiswa      : " + alamat.get(3));
        System.out.println(" ");

        //ukuran data mahasiswa
        System.out.println("-----(Ukuran Data Mahasiswa)------");
        System.out.println(" ");
        System.out.println("Banyak Data untuk Nama Mahasiswa        : " + nama_mahasiswa.size());
        System.out.println("Banyak Data untuk Nomor Induk Mahasiswa : " + no_bp.size());
        System.out.println("Banyak Data untuk Alamat Mahasiswa      : " + alamat.size());

    } 
    
}
