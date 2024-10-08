import java.util.Scanner;
public class KafeDoWhile16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti = 0;
        String namapelanggan;

        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        int totalHarga;
        namapelanggan = "";
        
        System.out.println("Nama pelanggan: " + namapelanggan);
        System.out.println("Harga kopi: " + hargaKopi);
        System.out.println("Harga teh: " + hargaTeh);
        System.out.println("Harga roti: " + hargaRoti);

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namapelanggan = sc.nextLine();
            
            if (namapelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan. ");
                break;
                
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Nama pelanggan: " + namapelanggan);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
            System.out.println("Semua transaksi selesai");
        }while (true);
        System.out.println("Semua transaksi selesai");
    
    }
    }
