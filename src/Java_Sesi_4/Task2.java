package Java_Sesi_4;

public class Task2 {
    public static void main(String[] args) {
        for (int m = 0; m < 3; m++) {
            // Menggunakan loop untuk mencetak angka dari m+1 sampai m+6
            for (int h = 1 + m; h <= 6 + m; h++) {
                System.out.print(h + " ");
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
