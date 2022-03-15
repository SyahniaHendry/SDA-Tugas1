package sda.tugas1;

import java.util.LinkedList;
import java.util.Queue;

public class tugas4 {
    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<>();

        System.out.println("");
        System.out.println("Antrian rumah sakit Unand");
        System.out.println("-------------------------");
        
        antrian.add("Syahnia");
        antrian.add("Putri");

        System.out.println("1. Antrian awal");
        System.out.println("Antrian:" + antrian);
        System.out.println("-------------------------");

        antrian.add("Hendry");
        antrian.add("SPH");

        System.out.println("2. Antrian setelah ditambah");
        System.out.println("Antrian:" + antrian);
        System.out.println("-------------------------");
    
        antrian.poll();
        antrian.poll();
        
        System.out.println("3. Antrian setelah penghapusan data");
        System.out.println("Antrian:" + antrian);
        System.out.println("-------------------------");

        //antrian.remove();
        //System.out.println("Antrian:" + antrian);
        //System.out.println("-------------------------");

        //antrian.clear();

        System.out.println("4. Antrian teratas");
        System.out.println("Dipanggil " + antrian.peek());
        //System.out.println("Dipanggil element " + antrian.element());
        System.out.println("-------------------------");

        antrian.clear();

        System.out.println("5. Jumlah antrian");
        System.out.println("Antrian: " + antrian);
        System.out.println("-------------------------");


    }

    
}
