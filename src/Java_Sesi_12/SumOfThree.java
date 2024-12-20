package Java_Sesi_12;

public class SumOfThree {
    public static int sumOfThree(int i, int a,int b,int c){
        
        if (i==0){
            return 0;
        } else {
            System.out.print(a+" ");
            sumOfThree(i-1, b, c, a+b+c);
        }
         return 0;   
        
    }
    public static void main(String[] args) {
        int i =5;
        int a =1;
        int b =1;
        int c =1;
        sumOfThree(i, a, b, c);
    }
}