package Java_Sesi_2;

import java.util.Scanner;

public class RumusPersegi {
    public static void main(String[] args) {
        // RUMUS PERSEGI PANJANG

        int p,l,luas,keliling;
        
        Scanner input = new Scanner(System.in);

        System.out.println("### RUMUS PERSEGI PANJANG ###");
        System.out.println("====================");
        System.out.print("Panjangnya Berapa: ");
        p = input.nextInt();
        System.out.print("Luasnya Berapa: ");
        l= input.nextInt();
        System.out.println("====================");

        keliling = 2*(p+l);
        luas= p*l;

        System.out.println("Kelilingnya: "+keliling+" cm");
        System.out.println("Luasnya: "+luas+" cm");

        input.close();
    }
}
