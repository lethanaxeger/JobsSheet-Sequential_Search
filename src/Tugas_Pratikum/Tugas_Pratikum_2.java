package Tugas_Pratikum;

public class Tugas_Pratikum_2 {
    public static void main(String[] args) {
        
        double ratarata = 0.0;
        int[] data = new int[]{83,76,45,90,85,80,78,74};
        System.out.println("Data pada array");
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"\t");

        }
        for(int i = 0; i < data.length; i++) ratarata += data [i];
        ratarata /= data.length;
        
        System.out.println("\nRata-rata nilai array = " + ratarata);
        
        System.out.println("\nNilai yang di atas rata-rata: ");
        for(int j = 0; j < data.length; j++) {
            if (data[j] > ratarata) {
                System.out.print(data[j] + "\t");
            }
        }
    }
}
