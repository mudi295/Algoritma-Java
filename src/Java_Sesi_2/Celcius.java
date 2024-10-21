package Java_Sesi_2;
import java.util.Scanner;
public class Celcius {
    public static void main(String[] args) {
        // MENGHITUNG FAHRENHEIT DARI CELCIUS 

        double c,f;

        Scanner input = new Scanner(System.in);

        System.out.println("### KALKULATOR FAHRENHEIT DARI CELCIUS ###");
        System.out.print("Berapa Celcius: ");
        c = input.nextDouble();
        System.out.println("===============");

        f = (c*9/5)+32;
        System.out.println("Menjadi: "+f+" Fahrenheit");

        input.close();

    }
}
