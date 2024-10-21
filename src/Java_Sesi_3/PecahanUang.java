package Java_Sesi_3;
import java.util.Scanner;

public class PecahanUang {

    public static void main(String[] args) {
        int satuan;

        Scanner isi = new Scanner(System.in);
        System.out.print("Masukan Jumlah Uang Anda: Rp. ");
        int jumlahUang = isi.nextInt();

        if (jumlahUang >= 100000) {
            satuan = jumlahUang / 100000;
            jumlahUang = jumlahUang % 100000;
            System.out.println(satuan + " Lembar Uang 100.000 Ribu");
        }

        if (jumlahUang >= 50000) {
            satuan = jumlahUang / 50000;
            jumlahUang = jumlahUang % 50000;
            System.out.println(satuan + " Lembar Uang 50.000 Ribu");
        }

        if (jumlahUang >= 20000) {
            satuan = jumlahUang / 20000;
            jumlahUang = jumlahUang % 20000;
            System.out.println(satuan + " Lembar Uang 20.000 Ribu");
        }
        if (jumlahUang >= 10000) {
            satuan = jumlahUang / 10000;
            jumlahUang = jumlahUang % 10000;
            System.out.println(satuan + " Lembar Uang 10.000 Ribu");
        }

        if (jumlahUang >= 5000) {
            satuan = jumlahUang / 5000;
            jumlahUang = jumlahUang % 5000;
            System.out.println(satuan + " Lembar Uang 5.000 Ribu");
        }

        if (jumlahUang >= 2000) {
            satuan = jumlahUang / 2000;
            jumlahUang = jumlahUang % 2000;
            System.out.println(satuan+ " Lembar Uang 2.000 Ribu");
        }

        if (jumlahUang >= 1000) {
            satuan = jumlahUang / 1000;
            jumlahUang = jumlahUang % 1000;
            System.out.println(satuan + " Lembar Uang 1.000 Ribu");
        }

        if (jumlahUang >= 500) {
            satuan = jumlahUang / 500;
            jumlahUang = jumlahUang % 500;
            System.out.println(satuan + " Keping Uang 500 Ribu");
        }

        if (jumlahUang >= 100) {
            satuan= jumlahUang / 100;
            jumlahUang = jumlahUang % 100;
            System.out.println(satuan+ " Keping Uang 100 Ribu");
        }
        isi.close();
    }
}
