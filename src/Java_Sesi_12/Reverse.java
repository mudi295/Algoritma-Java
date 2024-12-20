package Java_Sesi_12;

public class Reverse {

    public static void main(String[] args) {
        reverse(5);
    }
    public static void reverse(int i){
        if(i>1){
            System.out.print( i + " ");
            reverse(i - 1);
        } else if(i==1){
            System.out.print(i);
        }
        return;
    }
    
}
