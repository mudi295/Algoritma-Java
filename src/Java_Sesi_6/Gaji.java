package Java_Sesi_6;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Gaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gaji,jamLembur;
        System.out.println();
        System.out.println("PERHITUNGAN GAJI JIKA LEMBUR");
        
        System.out.println();
        System.out.println("=".repeat(20));
        System.out.print("Gaji: ");
        gaji = input.nextInt();
        System.out.print("Jam Lembur: ");
        jamLembur = input.nextInt();
        System.out.println("=".repeat(20));
        System.out.println();

        if (jamLembur > 4) {
            int upahLemburPerJam = (int) Math.ceil(gaji/173);
            int extra = jamLembur-4;
            int upah = ((4*upahLemburPerJam)+(extra*2*upahLemburPerJam));
            int upahAkhir = gaji + upah;

            NumberFormat numberFormat = NumberFormat.getInstance(Locale.ITALY);
            String totalGaji = numberFormat.format(upahAkhir);

            System.out.println("+".repeat(30));
            System.out.println();
            System.out.println("Gaji yang diterima: "+totalGaji);
            System.out.println();
            System.out.println("+".repeat(30));

            

        }else{

            int upahLemburPerJam = gaji/173;
            int upah = jamLembur * upahLemburPerJam;
            int upahAkhir = gaji + upah;

            NumberFormat numberFormat = NumberFormat.getInstance(Locale.ITALY);
            String totalGaji = numberFormat.format(upahAkhir);

            System.out.println("+".repeat(20));
            System.out.println("Gaji yang diterima: "+totalGaji);
            System.out.println("+".repeat(20));
        }
        input.close();

    }
}
