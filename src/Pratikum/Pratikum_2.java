package Pratikum;

import java.util.Scanner;

public class Pratikum_2 {
    public static void main (String[] args) {
        
        int cari;
        boolean found = false;
        int[] data = new int[]{8,90,56,90,87,76,42};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan data yang ingin dicari");
        cari = input.nextInt();
        for(int i = 0; i < data.length; i++) {
            if (cari == data[i]) {
                found = true;
                System.out.println("Data ditemukan pada indeks ke-" + i);
            }
        }
        
        if (found != true) {
            System.out.println("Data tidak ditemukan!");
        }
    }
}
