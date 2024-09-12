import java.util.Scanner;

public class Siakad04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, NilaiAkhir, nilaiUAS;

        System.out.print("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        NilaiAkhir = (nilaiKuis*0.2 + nilaiTugas*0.15 + nilaiUjian*0.3 + nilaiUAS*0.35);

        System.out.print("Nama: " + nama + " NIM: " + nim);
        System.out.println(" Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai akhir: " + NilaiAkhir);

        System.out.println("Mahasiswa dengan nama " + nama + (" NIM " + nim) + " Kelas " + kelas + " Nomor absen " + absen);
        System.out.print("Nilai akhir: " + NilaiAkhir);
    }
}