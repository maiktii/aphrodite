import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Siswa: ");

        String name = input.nextLine();

        System.out.println();

        System.out.print("Nilai Siswa: ");

        int nilai = input.nextInt();

        if (nilai <0 || nilai>100){
            System.out.println("Invalid nilai");
        }

        char grade = 'X';

        if (nilai>=90 && nilai <=100){
            grade = 'A';
        } else if (nilai>= 80 && nilai <= 89){
            grade = 'B';
        } else if (nilai>=70 && nilai<=79){
            grade = 'C';
        } else if (nilai>= 60 && nilai <= 69){
            grade = 'D';
        } else if (nilai<60){
            grade = 'E';
        }

        if (grade != 'A' || grade != 'B' || grade != 'C' || grade != 'D' || grade != 'E'){
            System.out.println("Grade tidak valid!");
        }

        System.out.println("Nama Siswa : "+name+" Nilai Siswa : "+nilai+" Grade : "+grade);
    }
}