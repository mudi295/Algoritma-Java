package Java_Sesi_3;

import java.util.Scanner;

public class KriteriaNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Konversi Nilai Menjadi Grade === ");

        //Ini untuk persentase dari setiap nilai yang di input
        double persentaseAbsen = 10.0/100; 
        double persentaseTugas = 20.0/100; 
        double persentaseProject = 25.0/100;  
        double persentaseQuiz = 5.0/100;  
        double persentaseUts = 20.0/100;   
        double persentaseUas = 20.0/100;   
        
        System.out.print("Masukkan Nama Mahasiswa : ");
        String namaMahasiswa = input.nextLine();
        
        System.out.print("Masukkan nilai absen : ");
        double nilaiAbsen = input.nextDouble();

        System.out.print("Masukkan nilai tugas : ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan nilai project : ");
        double nilaiProject = input.nextDouble();

        System.out.print("Masukkan nilai quiz : ");
        double nilaiQuiz = input.nextDouble();
        
        System.out.print("Masukkan nilai UTS : ");
        double nilaiUts = input.nextDouble();
        
        System.out.print("Masukkan nilai UAS : ");
        double nilaiUas = input.nextDouble();


        //Setelah input nilai lalu di (kali) dengan persentase yang sudah dicantumkan diatas lalu semuanya ditambahkan
        double nilaiAkhir = (nilaiAbsen * persentaseAbsen) +
                            (nilaiTugas * persentaseTugas) +
                            (nilaiProject * persentaseProject) +
                            (nilaiQuiz * persentaseQuiz) +
                            (nilaiUts * persentaseUts) +
                            (nilaiUas * persentaseUas);


        //buat variabel untuk grade dan keterangannya
        String grade;
        String keterangan;
        
        if (nilaiAkhir >= 85) {
            grade = "A";
        } else if (nilaiAkhir >= 75) {
            grade = "B";
        } else if (nilaiAkhir >= 65) {
            grade = "C";
        } else if (nilaiAkhir >= 55) {
            grade = "D";
        } else {
            grade = "E";
        }

        if (nilaiAkhir >= 85) {
            keterangan = "Lulus";
        } else if (nilaiAkhir >= 75) {
            keterangan = "Lulus";
        } else if (nilaiAkhir >= 65) {
            keterangan = "Remedial";
        } else if (nilaiAkhir >= 55) {
            keterangan = "Tidak lulus";
        } else {
            keterangan = "Tidak lulus";
        }

        //dan step terakhirnya masukan seluruh variabel kedalam out print
        System.out.println(" === Result === ");

        System.out.println("Nama mahasiswa : " + namaMahasiswa);
        System.out.println("Nilai akhir mahasiswa : " + (int)nilaiAkhir);
        System.out.println("Grade mahasiswa : " + grade);
        System.out.println("Keterangan : " + keterangan);

        input.close();
    }
    
}