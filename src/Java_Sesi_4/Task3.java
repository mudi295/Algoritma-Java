package Java_Sesi_4;

public class Task3 {
    public static void main(String[] args) {
        // Menggunakan loop untuk mencetak 6 baris
        for (int i = 0; i < 6; i++) {
            // Menggunakan loop untuk mencetak angka 1 sebanyak (6 - i) kali
            for (int j = 0; j < 6 - i; j++) {
                System.out.print("1 ");
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
