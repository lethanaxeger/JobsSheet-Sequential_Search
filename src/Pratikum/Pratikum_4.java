package Pratikum;

import java.util.Scanner;

public class Pratikum_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cari;
        System.out.print("Masukkan sebuah kata/kalimat : ");
        cari = input.nextLine();
        
        int a = 0;
        for (int i = 0; i < cari.length(); i++) {
            if (cari.charAt(i) == 'a') {
                a++;
            }
        }
        
        System.out.println("Jumlah huruf a pada kalimat di atas adalah " + a);
    }
}
