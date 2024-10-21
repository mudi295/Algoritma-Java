package Java_Sesi_2;

import java.util.Scanner;

public class VolumeKubus {
    public static void main(String[] args) {
        // RUMUS VOLUME KUBUS

        int s,volume;

        Scanner input = new Scanner(System.in);

        System.out.println("### MENGHITUNG VOLUME KUBUS ###");
        System.out.println("===============================");
        System.out.print("Sisinya Berapa: ");
        
        s = input.nextInt();

        volume = s*s*s;

        System.out.println("Volumenya: "+volume+" cm3");

        input.close();
    }   
}
