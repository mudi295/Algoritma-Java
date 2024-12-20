public class Main {
    
    // Fungsi rekursif untuk mencari nilai maksimum dalam array
    public static int cariMaksimum(int[] array, int index) {
        // Basis kasus: jika kita sudah mencapai elemen terakhir, kembalikan elemen itu sendiri
        if (index == array.length - 1) {
            return array[index];
        }
        
        // Rekursi: cari nilai maksimum di sisa array
        int maxDariSisa = cariMaksimum(array, index + 1);
        
        // Bandingkan elemen saat ini dengan nilai maksimum dari sisa array
        if (array[index] > maxDariSisa) {
            return array[index];
        } else {
            return maxDariSisa;
        }
    }

    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi array
        int[] array = {10, 20, 92, 50, 40};
        
        // Panggil fungsi rekursif untuk mencari nilai tertinggi
        int maksimum = cariMaksimum(array, 0);
        
        // Menampilkan nilai tertinggi
        System.out.println("Nilai tertinggi dalam array adalah: " + maksimum);
    }
}
