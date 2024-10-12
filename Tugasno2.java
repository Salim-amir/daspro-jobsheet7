import java.util.Scanner;

public class Tugasno2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi;
        double total = 0;

        // Proses input jenis kendaraan dan durasi hingga jenis == 0
        while (true) {
            System.out.println("Masukkan jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
            jenis = input.nextInt();
            
            if (jenis == 0) {
                break; // Jika input jenis adalah 0, keluar dari loop
            }

            System.out.println("Masukkan durasi parkir (dalam jam): ");
            durasi = input.nextInt();
            
            // Cek jika durasi parkir lebih dari 5 jam
            if (durasi > 5) {
                total += 12500; // Biaya flat Rp 12.500 untuk semua kendaraan
            } else {
                if (jenis == 1) { // Mobil
                    total += durasi * 3000; // Tarif mobil Rp 3.000 per jam
                } else if (jenis == 2) { // Motor
                    total += durasi * 2000; // Tarif motor Rp 2.000 per jam
                }
            }
        }
        
        // Output total biaya parkir
        System.out.println("Total biaya parkir: Rp " + total);
    }
}
