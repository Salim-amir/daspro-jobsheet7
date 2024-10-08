import java.util.Scanner;

public class Tugasno1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tiketTerjual = 0;
        double totalpendapatan = 0;
        double hargatiket = 50000;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang terjual (0 untuk selesai): ");
            int tiket = scanner.nextInt();

            // Memeriksa apakah input negatif
            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif. Silakan coba lagi.");
                continue;
            } 

            // Jika input 0, proses selesai
            if (tiket == 0) {
                break;
            }

            // Menambahkan jumlah tiket ke total
           

            // Menentukan diskon berdasarkan jumlah tiket yang dibeli
            double diskon = 0;
            if (tiket > 10) {
                diskon = 0.15;
                System.out.println("Mendapatkan Diskon 15%");
            } else if (tiket > 4) {
                diskon = 0.10;
                System.out.println("Mendapatkan Diskon 10%");
            }

            // Menghitung total penjualan dengan diskon jika ada
            double sale = tiket * hargatiket * (1 - diskon);
            totalpendapatan += sale;

            System.out.println("Penjualan untuk " + tiket + " tiket: Rp " + sale);
        }

        // Menampilkan total penjualan setelah input selesai
        System.out.println("Total tiket terjual: " + tiketTerjual);
        System.out.println("Total penjualan: Rp " + totalpendapatan);

        scanner.close();
    }
}
