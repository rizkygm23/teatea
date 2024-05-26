/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class penjualanBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data petugas dan tanggal
        System.out.println("PT. PERMATA \"PRATAMA\"");
        System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +");
        System.out.print("Masukan Nama Petugas: ");
        String namaPetugas = input.nextLine();
        System.out.print("Tanggal: ");
        String tanggal = input.nextLine();

        // Input jumlah data
        System.out.print("Jumlah Data yang akan dimasukkan: ");
        int jumlahData = input.nextInt();
        
        // Deklarasi array untuk menyimpan data barang
        String[] kodeBarang = new String[jumlahData];
        String[] namaBarang = new String[jumlahData];
        int[] hargaBarang = new int[jumlahData];
        int[] jumlahBarang = new int[jumlahData];
        int[] totalHarga = new int[jumlahData];

        // Input data barang
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data Ke-" + (i+1));
            input.nextLine(); // Clear buffer
            System.out.print("Kode Barang: ");
            kodeBarang[i] = input.nextLine();
            System.out.print("Jumlah: ");
            jumlahBarang[i] = input.nextInt();

            // Assign nama dan harga barang berdasarkan kode barang
            switch (kodeBarang[i].toUpperCase()) {
                case "P001":
                    namaBarang[i] = "Printer";
                    hargaBarang[i] = 700000;
                    break;
                case "V001":
                    namaBarang[i] = "VGA Card";
                    hargaBarang[i] = 75000;
                    break;
                case "M001":
                    namaBarang[i] = "Motherboard";
                    hargaBarang[i] = 950000;
                    break;
                default:
                    System.err.println("Kode barang tidak valid");
                    break;
            }

            // Hitung total harga
            totalHarga[i] = hargaBarang[i] * jumlahBarang[i];
        }

        // Output
        System.out.println("Modul Pemrograman Berbasis Objek I");
        System.out.println("PT. PERMATA \"PRATAMA\"");
        System.out.println("==========================================================================================");
        System.out.println("Nama petugas                :"+ namaPetugas + "\t\t" + "Tanggal         :" + tanggal);
        System.out.println("Jumlah data yang dimasukan  :"+ jumlahData);
        System.out.println("==========================================================================================");
        System.out.println("DATA KE-\t"+"Kode Barang\t"+"Harga Barang\t"+"Jumlah Barang\t"+"Total Harga");
        for (int i=0;i<jumlahData;i++){
            int nomor = i+1;
            System.out.println(nomor +"\t"+kodeBarang[i]+"\tRp."+hargaBarang[i]+"\t"+jumlahBarang[i]+"\tRp."+totalHarga[i]);
        }
//        Menghitung total
        int totalPendapatan =0;
        for (int i = 0; i < totalHarga.length; i++) {
        
        totalPendapatan = totalPendapatan +  totalHarga[i];
    }
        
        System.out.println("Total pendapatan pada tanggal"+ tanggal + "adalah sebesar Rp."+ totalPendapatan);
        
        

    }
    
}
