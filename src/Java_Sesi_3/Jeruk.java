package Java_Sesi_3;
import java.util.Scanner;

public class Jeruk {
    public static void main(String[] args) {
        int harga1 = 3000;
        int harga2 = 5000;
        int harga5 = 10000;
        int totalHarga = 0;
        
        Scanner isi = new Scanner(System.in);
        
        System.out.print("Mau beli berapa jeruk: ");
        int jumlahJeruk = isi.nextInt();
        
        if (jumlahJeruk >= 5) {
            int harga5buah = (jumlahJeruk / 5) * harga5;
            jumlahJeruk = jumlahJeruk % 5;
            totalHarga += harga5buah; 
        }
        if (jumlahJeruk >= 2) {
            int harga2buah = (jumlahJeruk / 2) * harga2;
            jumlahJeruk = jumlahJeruk % 2;
            totalHarga += harga2buah;
        }
        if (jumlahJeruk >= 1) {
            int harga1buah = (jumlahJeruk / 1) * harga1;
            jumlahJeruk = jumlahJeruk % 1;
            totalHarga += harga1buah;
        }
        System.out.println("Totalnya jadi: "+totalHarga);

        isi.close();
    }
}