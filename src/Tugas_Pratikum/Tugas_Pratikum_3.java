package Tugas_Pratikum;

public class Tugas_Pratikum_3 {
    public static void main(String[] args) {
        
        //Deklarasi
        int[] data = new int[]{92,98,76,72,84,101,39};
        System.out.println("Nilai pada array: ");
        
        //Cetak Nilai
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"\t");
        } 
        System.out.println("\nNilai yang merupakan kelipatan tiga:");
        for (int j = 0; j < data.length; j++) {
            if (data[j] % 3 == 0) {
                
                System.out.print(data[j] + "\t");
            }
        }
    }
}
