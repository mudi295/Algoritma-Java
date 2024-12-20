package Java_Sesi_12;

import java.util.Arrays;
import java.util.Scanner;

public class ContainsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[]={1,2,3,4,5,6,7,8,9,10};

        System.out.println("=".repeat(60));
        for (int i = 0; i < array.length; i++) {
            System.out.print("| " +array[i] + " | ");
        }
        System.out.println();
        System.out.println("=".repeat(60));
        System.out.print("Pilih angka 1-10: ");

        int target = input.nextInt();
        int index = Arrays.binarySearch(array, target);
        boolean hasil = contains(array, 0, target);

        if (index >= 0) {
            System.out.println("Angka: "+target+" berada di index: "+index+" dan bernilai: "+hasil);
        } else {
            System.out.println("Angka:"+target+" Tidak ditemukan di dalam Array dan bernilai: "+hasil);
        }
        input.close();
    }
    
    public static boolean contains(int[]array, int n, int target){
        if (n==array.length){
            return false;
        } else if(array[n]==target){
            return true;
        }
        return contains(array, n+1, target);
    }
}
