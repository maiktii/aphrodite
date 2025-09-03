import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Pembeli : ");
        String name = input.nextLine();

        if(name.isEmpty()){
            System.out.println("Nama tidak boleh kosong");
            return;
        }

        System.out.print("Total Belanja : ");
        double totalBelanja = input.nextDouble();
        input.nextLine();

        if (totalBelanja < 0){
            System.out.println("Invalid totalBelanja!");
            return;
        }

        System.out.print("Status Membership : ");
        String statusMember = input.nextLine();


        input.close();

        if (statusMember.isEmpty()){
            System.out.println("Membership wajib diisi!");
            return;
        }

        if (!statusMember.equals("regular") && !statusMember.equals("premium") && !statusMember.equals("non-member")){
            System.out.println("Membership invalid");
            return;
        }

        int diskon = 0;
        double potongan = 0.0;
        double totalBiaya = 0;

        if (statusMember.equals("regular")){
            if (totalBelanja >= 100000 && totalBelanja < 500000){
                diskon = 5;
            } else if (totalBelanja >= 500000){
                diskon = 10;
            }
        } else if (statusMember.equals("premium")){
            if (totalBelanja >= 100000 && totalBelanja < 300000){
                diskon = 10;
            } else if (totalBelanja >= 300000 && totalBelanja < 500000){
                diskon = 15;
            } else if (totalBelanja >= 500000) {
                diskon = 20;
            }
        } else {
            diskon = 0;
        }

        potongan = (double)diskon / 100 * totalBelanja;
        totalBiaya = totalBelanja - potongan;

        System.out.println("Nama Pembeli : "+name);
        System.out.println("Total Belanja : "+totalBelanja);
        System.out.println("Presentase diskon : "+diskon+"%");
        System.out.println("Nominal diskon : "+potongan);
        System.out.println("Total Bayar : "+totalBiaya);
    }
}