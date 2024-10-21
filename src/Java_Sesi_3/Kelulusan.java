package Java_Sesi_3;

import java.util.Scanner;

/**
 * Kelulusan
 */
public class Kelulusan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilainya: ");
        int nilai = input.nextInt();

        if (nilai >=75) {
            System.out.println("Selamat anda lulus!");
        }else{
            System.out.println("Maaf, Anda tidak lulus");
        }
        input.close();
    }

}