package Tugas_Pratikum;

import java.util.Scanner;

public class Tugas_Pratikum_1 {
    public static void main(String[] args) {
        
        int cari;
        int b = 0;
        boolean found = false;
        Scanner input = new Scanner(System.in);
        int[] data = new int[]{74,98,72,74,72,90,81,72};
        System.out.println("Data pada array");
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"\t");
            if (data[i] < b) {
                b = data[i]; 
            }
        }
        System.out.print("\nMasukkan nilai yang dicari: ");
        cari = input.nextInt();
        
        for(int i = 0; i < data.length; i++) {
            if (cari == data[i]) {
                b++;
            }
        } 
        if (b == 0) {
            System.out.println("\nData tidak ditemukan!");
        } else {
        System.out.println("\nData yang dicari ditemukan sebanyak " + b + " kali.");
        }
    }
}
