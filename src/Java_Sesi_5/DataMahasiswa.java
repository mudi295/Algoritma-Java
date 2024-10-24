package Java_Sesi_5;

import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Buat inisiasi Array dengan variabel mahasiswa[untuk nama],nilai,dan keterangan.
        //Buat juga variabel lanjut untuk menentukan mau lanjut atau berhenti dengan type data String.
        String[] mahasiswa = new String[5];
        int[] nilai = new int[5];
        String[] keterangan = new String[5];
        String lanjut = "y";

        //Lalu buat variabel sum[summary] untuk jumlah nilai nanti, dan variabel index untuk array
        int sum = 0;
        int i = 0;

        do {
            System.out.print("Masukan Nama Anda: ");
            mahasiswa[i] = input.nextLine();
            System.out.print("Masukan Nilai Anda: ");
            nilai[i] = input.nextInt();
            input.nextLine();
            
            //Buat percabangan untuk keterangan
            if (nilai[i] >= 75) {
                keterangan[i] = "Lulus";
            } else {
                keterangan[i] = "Tidak Lulus";
            }

            //Buat inputan untuk melanjutkan tambah data atau cukup[berhenti]
            System.out.print("Lagi? (y/n): ");
            lanjut = input.nextLine().toLowerCase();
            
            //buat yang tadinya sum itu nol sekarang ditambah dengan nilai[i],lalu index nya ditambah
            sum += nilai[i];
            i++;
        } 
        //disini menentukan jika index belum sampe 5 dan user memilih untuk lanjut "y", maka program akan dilanjutkan sampe index mencapai 5 atau user memilih berhenti "n"
        while (i < 5 && lanjut.equals("y"));

            //jika sudah mencapai 5 data atau user memilih berhenti "n", maka akan tampil sebuah tabel Daftar Nilai mahasiswa diantaranya ada No. Nama,Nilai, dan keterangan.
            System.out.println();
            System.out.println("DAFTAR NILAI MAHASISWA");
            System.out.println("====================");
            System.out.println("No\tNama\tNilai\tKeterangan");

        //disini buat perulangan untuk isi data di tabelnya
        for (int j = 0; j < mahasiswa.length; j++) {
            if (mahasiswa[j] == null) {
                break;
            }
            //dan memunculkan data yang diantaranya (j+1) untuk nomor berurutan, mahasiswa[j] untuk nama yang diinputkan,nilai,dan keterangan yang sudah kita atur dipercabangan tadi.
            System.out.println((j+1)+"\t" + mahasiswa[j]+"\t"+nilai[j]+"\t" + keterangan[j]);
        }
        
        //kemudian membuat rumus untuk rata-rata
        double avg = sum/i;

            //dan tampilan akhirnya yaitu memanggil total nilai dengan variabel sum dan rata-rata dengan variabel avg sesuai dengan variabel yang kita buat tadi.
            System.out.println("====================");
            System.out.println("Total Nilai: "+sum);
            System.out.println("Rata-ratanya: "+ avg);

        input.close();
    }
}
