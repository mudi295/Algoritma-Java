package Java_Sesi_3;
import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Angka: ");
        int angka = input.nextInt();
        if (angka % 2 == 0) {
            System.out.println("Ini adalah bilangan genap");
        }else{
            System.out.println("Ini adalah bilangan Ganjil");
        }

        input.close();

    }
}