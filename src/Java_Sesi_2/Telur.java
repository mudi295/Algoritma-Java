package Java_Sesi_2;
import java.util.Scanner;
/**
 * Telur
 */
public class Telur {

    public static void main(String[] args) {
        // SISTEM TOKO TELUR HAJI MAKMUR 

        int total;
        int cash;
        int kembalian;
        int harga = 28000;
        double jumlah;

        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang di Toko Telur Haji Makmur");
        System.out.println("#############################################");
        System.out.print("Jumlah Telur(Kg): ");
        jumlah = input.nextDouble();
        System.out.println("===============");

        
        System.out.println(jumlah+" Kilo Telur");
        System.out.println("===============");
        total = (int) (jumlah*harga) ;
        System.out.println("Harganya Rp."+harga+" Per Kilo");
        System.out.println("Totalnya Rp."+total);
        System.out.println("===============");
        System.out.print("Uang Diberikan: ");
        cash = input.nextInt();
        System.out.println("===============");
        System.out.println("Cash Rp."+cash);
        kembalian = cash-total;
        System.out.println("Kembalian Rp."+kembalian);

        System.out.println("#########################################");
        System.out.println("Terimakasih!, Selamat Datang Kembali");
        
        input.close();

    }
}