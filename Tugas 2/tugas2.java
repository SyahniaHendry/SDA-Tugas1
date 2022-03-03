package sda.tugas1;

import java.util.LinkedList;

public class tugas2 {
    public static void main(String[] args) {
        LinkedList <String> saya = new LinkedList<String>();
        //Menambahkan data awal yakni nama lengkap saya
        saya.add("S");
        saya.add("Y");
        saya.add("A");
        saya.add("H");
        saya.add("N");
        saya.add("I");
        saya.add("A");
        saya.add(" ");
        saya.add("P");
        saya.add("U");
        saya.add("T");
        saya.add("R");
        saya.add("I");
        saya.add(" ");
        saya.add("H");
        saya.add("E");
        saya.add("N");
        saya.add("D");
        saya.add("R");
        saya.add("Y");

        System.out.println("Nama Lengkap Saya : " + saya );
        System.out.println("size : "+saya.size());

        //Soal 1 : add karakter lain yang anda inginkan
        saya.add(6,"X");
        saya.add(14,"H");
        saya.add(21,"A");

        System.out.println("Nama Saya setelah ditambah beberapa karakter : " + saya );
        System.out.println("size : "+saya.size());

        //Soal 2 : sisipkan karakter lain yang anda inginkan
        saya.set(8,"R");
        saya.set(17,"O");
        saya.set(21,"I");
        saya.set(4," ");

        System.out.println("Nama Saya setelah digantikan dengan beberapa karakter : " + saya );
        System.out.println("size : "+saya.size());

        //Soal 3 : hapus beberapa karaker yang ingin anda hapus
        saya.removeLast();
        saya.remove(3);
        saya.remove(8);

        System.out.println("Nama Saya setelah menghilangkan beberapa karakter : " + saya );
        System.out.println("size : "+saya.size());

        //Soal 4 : buat fungsi POP dan PUSH pada project anda
        //Push
        saya.push("Y");
        saya.push("T");
        saya.push("R");
        saya.push("E");
        saya.push("W");
        saya.push("Q");

        System.out.println("Nama Saya setelah di push : " + saya );
        System.out.println("size : "+saya.size());

        //Pop
        saya.pop();
        saya.pop();
        saya.pop();

        System.out.println("Nama Saya setelah di pop : " + saya );
        System.out.println("size : "+saya.size());

    }
}
