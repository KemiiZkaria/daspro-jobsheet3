import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jumlahJamKerja, upahPerJam, gajiKaryawan, bonus, pajak, gajiBersih;

        System.out.print("Masukkan jumlah jam kerja karyawan: ");
        jumlahJamKerja = sc.nextDouble();
        System.out.print("Masukkan jumlah Upah per jam karyawan: ");
        upahPerJam = sc.nextDouble();

        gajiKaryawan = jumlahJamKerja*upahPerJam;
        bonus = gajiKaryawan*0.1;
        pajak = gajiKaryawan*0.05;
        gajiBersih = gajiKaryawan + bonus - pajak;
        
        System.out.print("Total gaji bersih karyawan adalah sebesar:" + gajiBersih);
    }
}
