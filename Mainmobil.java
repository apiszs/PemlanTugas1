
import java.util.Scanner;
import praktikumpemlan.Mobil;

public class Mainmobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Membuat objek mobil pertama
        Mobil m1 = new Mobil();
        System.out.print("Masukkan manufaktur mobil pertama: ");
        m1.setManufaktur(input.nextLine());
        System.out.print("Masukkan nomor plat mobil pertama: ");
        m1.setNoPlat(input.nextLine());
        System.out.print("Masukkan warna mobil pertama: ");
        m1.setWarna(input.nextLine());
        System.out.print("Masukkan kecepatan mobil pertama (km/h): ");
        m1.setKecepatan(input.nextInt());
        System.out.print("Masukkan waktu perjalanan (jam): ");
        m1.setWaktu(input.nextDouble());
        m1.displayMessage();
        
        System.out.println("================");
        input.nextLine(); // Membersihkan buffer
        
        // Membuat objek mobil kedua
        Mobil m2 = new Mobil();
        System.out.print("Masukkan manufaktur mobil kedua: ");
        m2.setManufaktur(input.nextLine());
        System.out.print("Masukkan nomor plat mobil kedua: ");
        m2.setNoPlat(input.nextLine());
        System.out.print("Masukkan warna mobil kedua: ");
        m2.setWarna(input.nextLine());
        System.out.print("Masukkan kecepatan mobil kedua (km/h): ");
        m2.setKecepatan(input.nextInt());
        System.out.print("Masukkan waktu perjalanan (jam): ");
        m2.setWaktu(input.nextDouble());
        m2.displayMessage();
        
        input.close();
    }
}
