import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Print Variabel");
        Variables variabel = new Variables();
        variabel.PrintVariables();
        System.out.println();

        System.out.println("Aritmatika sederhana");
        Arithmatic arithmatic = new Arithmatic();
        System.out.println("Masukan variabel 1: ");
        int x = scan.nextInt();
        System.out.println(("Masukan variabel 2: "));
        int y = scan.nextInt();
        System.out.println("Hasil dari aritmatika pertambahan: " + arithmatic.Pertambahan(x,y));
        System.out.println("Hasil dari aritmatika pengurangan: " + arithmatic.Pengurangan(x,y));
        System.out.println();

        System.out.println("Cek Ganjil/Genap");
        OddEven ganjilgenap = new OddEven();
        System.out.println("Masukkan angka 1: ");
        int z = scan.nextInt();
        System.out.println("Masukkan angka 2: ");
        int w = scan.nextInt();
        System.out.print("hasil dari penjumlahan adalah angka ");
        System.out.println(ganjilgenap.oddEven(z,w));
        }
}
