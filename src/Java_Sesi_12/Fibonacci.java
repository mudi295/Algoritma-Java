package Java_Sesi_12;

public class Fibonacci {
    public static void main(String[] args) {
        int n =5;
        int a =1;
        int b =1;
        fib(n, a, b);
    }
    public static int fib(int n, int a,int b){
        
        if (n==1){
            System.out.print(a);
        } else {
            System.out.print( a + " ");
            fib(n-1, b, a+b);
        }
         return 0;   
        
    }
}