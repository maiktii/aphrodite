import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama karyawan: ");
        String namaKaryawan = input.nextLine();

        System.out.print("Masukkan jam masuk: ");
        int jamMasuk = input.nextInt();


        int jam = jamMasuk / 100;
        int menit = jamMasuk % 100;

        if (jam < 0 || jam > 23 || menit < 0 || menit > 59) {
            System.out.println("Format jam tidak valid.");
            return;
        } else {
            System.out.printf("Jam masuk yang tercatat: %02d:%02d\n", jam, menit);
        }


        System.out.print("Masukkan gaji harian: ");
        double gajiHarian = input.nextDouble();

        if (gajiHarian < 0){
            System.out.println("Gaji tidak boleh 0");
            return;
        }

        input.close();

        String status = "";
        double potongan = 0.0;
        double gajiAkhir = 0.0;

        if (jamMasuk <= 800){
            status = "Tepat Waktu";
        } else if (jamMasuk >= 801 && jamMasuk <= 815){
            status = "Terlambat Ringan";
            potongan = 0.01 * gajiHarian;
        } else if (jamMasuk >= 816 && jamMasuk <= 830){
            status = "Terlambat Sedang";
            potongan = 0.03 * gajiHarian;
        } else if (jamMasuk > 830){
            status = "Terlambat Berat";
            potongan = 0.05 * gajiHarian;
        }

        gajiAkhir = gajiHarian - potongan;
        System.out.println("Nama Karyawan : "+namaKaryawan);
        System.out.println("Status Kehadiran : "+status);
        System.out.println("Potongan gaji : "+potongan);
        System.out.println("Gaji yang diterima : "+gajiAkhir);
    }
}