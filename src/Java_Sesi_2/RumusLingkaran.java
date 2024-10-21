package Java_Sesi_2;

import java.util.Scanner;

public class RumusLingkaran {
    public static void main(String[] args) {
        // RUMUS KELILING DAN LUAS LINGKARAN

        double luas,keliling,r,kelilingg,r2;
        double phi = 3.14;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("### MENGHITUNG RUMUS LINGKARAN ###");
        System.out.println("========================================");
        System.out.print("Berapa Jari-jarinya: ");
        r = input.nextDouble();
        System.out.println("===============");

        keliling = 2*phi*r;
        kelilingg = 2*(22*r/7);

        System.out.println("Kelilingnya adalah: "+keliling+" cm (Pake rumus 3,14)");
        System.out.println("Kelilingnya adalah: "+kelilingg+" cm (Pake rumus 22/7)");
        System.out.println("================");
        r2 = r*r;
        luas = (22*r2)/7;
        System.out.println("Luasnya adalah: "+luas+" cm2");
        System.out.println("===============");


        input.close();
    }
}
