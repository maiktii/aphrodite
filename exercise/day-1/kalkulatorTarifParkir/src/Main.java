import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis kendaraan: ");
        String jenisKendaraan = input.nextLine();

        if (!jenisKendaraan.equals("motor") && !jenisKendaraan.equals("mobil")){
            System.out.println("jenis kendaraan invalid!");
            return;
        }

        System.out.print("Masukkan lama parkir (jam): ");
        int lamaParkir = input.nextInt();

        if (lamaParkir < 0){
            System.out.println("Lama Parkir invalid!");
            return;
        }

        input.close();


        int total = 0;

        if (jenisKendaraan.equals("motor")){
            if (lamaParkir <= 2){
                total = 2000;
            } else  {
                total = 2000 + (lamaParkir - 2) * 1000;
            }
        } else if (jenisKendaraan.equals("mobil")) {
            if (lamaParkir <= 2) {
                total = 5000;
            } else {
                total = 5000 + (lamaParkir - 2) * 2000;
            }
        }

        if (jenisKendaraan.equals("motor") && total > 10000){
            total = 10000;
        } else if (jenisKendaraan.equals("mobil") && total > 25000){
            total = 25000;
        }

        System.out.println("Jenis Kendaraan : "+jenisKendaraan);
        System.out.println("Lama Parkir: "+lamaParkir);
        System.out.println("Total Biaya: "+total);
    }
}