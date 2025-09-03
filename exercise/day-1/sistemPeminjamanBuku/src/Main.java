import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama anggota : ");
        String namaAnggota = input.nextLine();

        if (namaAnggota.isEmpty()){
            System.out.println("Nama Anggota wajib diisi!");
            return;
        }

        System.out.print("Masukkan jenis anggota : ");
        String jenisAnggota = input.nextLine();

        if (jenisAnggota.isEmpty()){
            System.out.print("Jenis Anggota Wajib diisi!");
            return;
        }

        if (!jenisAnggota.equals("mahasiswa") && !jenisAnggota.equals("dosen") && !jenisAnggota.equals("umum")){
            System.out.println("Jenis Anggota invalid!");
            return;
        }

        System.out.print("Hari peminjaman yang sudah berlalu : ");
        int hariBerlalu = input.nextInt();


        input.close();

        String statusPeminjaman = "tepat waktu";
        int totalDenda = 0;
        int limitHariMahasiswa = 14;
        int limitHariDosen = 21;
        int limitHariUmum = 7;
        int limitSanksi = 30;


        if (jenisAnggota.equals("mahasiswa")){
            if (hariBerlalu > limitHariMahasiswa) {
                totalDenda = 1000 * (hariBerlalu - limitHariMahasiswa);
                statusPeminjaman = "terlambat";
            }
        } else if(jenisAnggota.equals("dosen")){
            if (hariBerlalu > limitHariDosen){
                totalDenda = 2000 *(hariBerlalu-limitHariDosen);
                statusPeminjaman = "terlambat";
            }
        } else{
            if (hariBerlalu > limitHariUmum){
                totalDenda = 500 * (hariBerlalu - limitHariUmum);
                statusPeminjaman = "terlambat";
            }
        }

        if (hariBerlalu > limitSanksi){
            statusPeminjaman = "Suspensi";
        }

        System.out.println("Nama Anggota : "+namaAnggota);
        System.out.println("Status Peminjaman : "+statusPeminjaman);
        System.out.println("Total Denda : Rp. "+totalDenda+",00");

    }
}