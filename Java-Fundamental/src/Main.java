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
        System.out.print("Masukan variabel 1: ");
        int x = scan.nextInt();
        System.out.print(("Masukan variabel 2: "));
        int y = scan.nextInt();
        System.out.print("Hasil dari aritmatika pertambahan: " + arithmatic.Pertambahan(x,y));
        System.out.print("\nHasil dari aritmatika pengurangan: " + arithmatic.Pengurangan(x,y));
        System.out.print("\nHasil dari aritmatika perkalian: " + arithmatic.Perkalian(x,y));
        System.out.println();

        System.out.println("Cek Ganjil/Genap");
        OddEven ganjilgenap = new OddEven();
        System.out.print("Masukkan angka 1: ");
        int z = scan.nextInt();
        System.out.print("Masukkan angka 2: ");
        int w = scan.nextInt();
        System.out.print("hasil dari penjumlahan adalah angka ");
        System.out.println(ganjilgenap.oddEven(z,w));
        System.out.println();

        System.out.println("Mencari bilangan yang habis dibagi 3, tidak habis dibagi 2");
        System.out.print("Masukan nilai integer positif: ");
        int n = scan.nextInt();
        while ( n < 0){
            System.out.print("Mohon masukkan nilai integer positif: ");
            n = scan.nextInt();
        }
        ThreeNotTwo three = new ThreeNotTwo(n);
        three.three();
        System.out.println();

        System.out.println("Mencari jumlah deret bilangan");
        System.out.print("Masukan jumlah deret: ");
        int u = scan.nextInt();
        UlangTambah ulang = new UlangTambah();
        System.out.println("Hasil jumlah deret bilangan: " + ulang.ulang(u));
        }
}
