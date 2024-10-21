package Java_Sesi_4;

public class Task6 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        int d = 1;
        int i = 2;

        while (d <= 81) {
            if (i == 2) {
                i++;
            } else {
                System.out.print(d + " ");
                d = a + b + c;
            }
            a = b;
            b = c;
            c = d;
        }
    }
}
