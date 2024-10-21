package Java_Sesi_4;

public class Task4 {
    public static void main(String[] args) {
         // Menggunakan loop untuk mencetak 3 baris
         for (int i = 0; i < 3; i++) {
            // Jika baris genap, cetak "S 0 S 0 S 0"
            if (i % 2 == 0) {
                System.out.println("S 0 S 0 S 0");
            } else { // Jika baris ganjil, cetak "O S O S O S"
                System.out.println("O S O S O S");
            }
        }

    //     for (int i = 1; i <= 3; i++) {
    //         for (int j = 1; j <= 6; j++) {
    //           if((j%2==1)  ^ (i%2==0)){
    //             System.out.print("S ");
    //           }else{
    //             System.out.print("0 ");
    //           }
    //         }
    //         System.out.println("");
    // }
    }
}
