//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //SOAL 1
        int andi = 12;
        int adikAndi = 4;

        int solusiPertama = andi - adikAndi;

        System.out.println("Kue yang tersisa adalah "+solusiPertama+" Operator yang dapat digunakan adalah (-)");

        //SOAL 2
        float ongkirAwal = 25000.00f;
        float discOngkir = 0.5f;

        float solusiKedua = ongkirAwal * discOngkir;

        System.out.println("Ongkir yang harus dibayar "+solusiKedua+" Operator yang dapat digunakan adalah (*)");

        //SOAL 3
        int permenSinta = 20;
        int pembagi = 6;

        float solusiKetiga = permenSinta % pembagi;

        System.out.println("Sisa permen yang tidak terbagi adalah "+solusiKetiga+ "Operator yang dapat digunakan adalah (%) ");

        //SOAL 4
        int pointPertama = 80;
        int jumlahNaikLevel = 1;
        int tambahanPoint = 15 * jumlahNaikLevel;

        int solusiKeempat = pointPertama + tambahanPoint;

        System.out.println("Total point pemain adalah "+solusiKeempat+" Operator yang dapat digunakan adalah (+) dan (*)");

        //SOAL 5
        int batasUmur = 18;
        int umurBudi = 16;

        if (umurBudi <= batasUmur){
            System.out.println("Budi belum boleh masuk");
        } else{
            System.out.println("Budi boleh masuk");
        }

    }
}