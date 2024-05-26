
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        String pendidikan, nama;
        int jabatan, jamkerja, jamkerjabln = 200,gajipokok = 300000,lemburan =0 ;
        double  tunjanganJabatan = 0, tunjanganPendidikan = 0, totalHonor=0;
        double satu = 0.05, dua = 0.10, tiga = 0.15, SMA = 0.025, DIPLOMA = 0.05, SARJANA = 0.075;
        Scanner input = new Scanner(System.in);
        System.out.println("PT DINGIN DAMAI");
        System.out.println("Program Hitung Honor Karyawan");
        System.out.print("Nama Karyawan             :");
        nama = input.nextLine();
        System.out.print("Golongan                  :");
        jabatan = input.nextInt();
        input.nextLine(); // Membersihkan buffer
        System.out.print("Pendidikan SMU/D3/SI      :");
        pendidikan = input.nextLine(); //
//        input.nextLine();
        System.out.print(" Jumlah Jam Kerja perhari :");
        jamkerja = input.nextInt();
        System.out.println("=================================================================");
        System.out.println("=================================================================");
        

        if (jabatan == 1) {
            tunjanganJabatan = gajipokok * satu;
        } else if (jabatan == 2) {
            tunjanganJabatan = gajipokok * dua;
        } else if (jabatan == 3) {
            tunjanganJabatan = gajipokok * tiga;
        } else {
            System.err.println("Inputan jabatan salah");
        }

        if (pendidikan.equalsIgnoreCase("SMU")) {
            tunjanganPendidikan = gajipokok * SMA;
        } else if (pendidikan.equalsIgnoreCase("D3")) {
            tunjanganPendidikan = gajipokok * DIPLOMA;
        } else if (pendidikan.equalsIgnoreCase("S1")) {
            tunjanganPendidikan = gajipokok * SARJANA;
        } else {
            System.err.println("Inputan pendidikan salah");
        }
        int inputjamKerjaBln = jamkerja*25;
        
        if (inputjamKerjaBln > jamkerjabln) {
            lemburan = (inputjamKerjaBln - jamkerjabln)*2500;
        }
        totalHonor = gajipokok+ tunjanganJabatan + tunjanganPendidikan + lemburan;
        int totalhonorint = (int) totalHonor;
            

        // Tampilkan hasil
        System.out.println("Nama: " + nama);
        System.out.println("Tunjangan Jabatan       :" + tunjanganJabatan);
        System.out.println("Tunjangan Pendidikan    :" + tunjanganPendidikan);
        System.out.println("Honor Lembur            :" + lemburan);
        System.out.println("=================================================================");
        System.out.println("Honor yang diterima     :" + totalhonorint);

        
        
    }
}

