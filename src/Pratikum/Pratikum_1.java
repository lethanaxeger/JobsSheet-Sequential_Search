package Pratikum;

import java.util.Scanner;

public class Pratikum_1 {
    public static void main(String[] args) {
        int cari;
        boolean found = false;
        int[] data = new int[]{2,4,10,94,96};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan data yang ingin dicari");
        cari = input.nextInt();
        for (int i = 0; i < data.length; i++) {
            if(cari == data[i]) {
                found = true;
                break;
            }
        }
        
        if (found == true) {
            System.out.println("Data ditemukan!");
        } else {
            System.out.println("Data tidak ditemukan!");
        }

    }
    
}
