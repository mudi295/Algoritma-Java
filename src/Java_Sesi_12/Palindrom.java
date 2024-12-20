package Java_Sesi_12;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan kata: ");
        String kata = input.next();

        isPalindrome(kata, 0, kata.length()-1);
        input.close();
    }
    public static boolean isPalindrome(String kata, int start, int end){
        if(start>=end){
            System.out.println( kata +" adalah palindrome");
            return true;
        }
        if (kata.charAt(start)!=kata.charAt(end)){
            System.out.println(kata+" bukan palindrome");
            return false;
        }
        if (kata.charAt(start)==kata.charAt(end)){
            return isPalindrome(kata, start+1, end-1);
        }
        return false;
    }
    
}
