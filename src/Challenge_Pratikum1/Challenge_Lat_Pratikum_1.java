package Challenge_Pratikum1;

import java.util.Scanner;

public class Challenge_Lat_Pratikum_1 {
    public static void main(String[] args) {
        
        //Deklarasi
        String cari;
        boolean found = false;
        String[]jenis = new String[]{"Rexus","Logitech","NYK","Corsair","Digital Alliance"};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama produk yang ingin dicari: ");
        cari = input.nextLine();
        
        // Proses Mencari
        for (int i = 0; i < jenis.length; i++) {
            if (cari.equalsIgnoreCase(jenis[i])){
                found = true;
                break;
            }
        }
        
        if (found = true) {
            System.out.println("\nData ditemukan");
        } else {
            System.out.println("\nData tidak ditemukan");
        }
    }
}
