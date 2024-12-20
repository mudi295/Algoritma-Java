package Java_Sesi_12;

public class MaxValueArray {
    
    
    public static int cariMaksimum(int[] array, int index) {
        
        if (index == array.length - 1) {
            return array[index];
        }
        
        
        int maxDariSisa = cariMaksimum(array, index + 1);
        
        
        if (array[index] > maxDariSisa) {
            return array[index];
        } else {
            return maxDariSisa;
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 23, 78, 52, 21, 45};
        
        int maksimum = cariMaksimum(array, 0);
        System.out.println("=".repeat(40));
        for (int i = 0; i < array.length; i++) {
            System.out.print("| " +array[i] + " | ");
        }
        System.out.println();
        System.out.println("=".repeat(40));
        
        System.out.println("Nilai tertinggi di dalam array adalah: " + maksimum);
    }
}
