import java.util.Scanner;

public class Tugas01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jumlahListrik, tarifListrik = 1500, tarifPenggunaan;
        
        System.out.print("Masukkan jumlah penggunaan listrik: ");
        jumlahListrik = sc.nextDouble();

        tarifPenggunaan = jumlahListrik*tarifListrik;
        System.out.println("Tarif Penggunaan listrik anda sebesar Rp." + tarifPenggunaan);

        boolean notifBatas = jumlahListrik > 500;
        System.out.println("Apakah penggunaan listrik anda lebih dari 500kWh? " + notifBatas);
    }
}
