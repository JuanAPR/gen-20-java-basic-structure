import java.util.Scanner;

public class MakeTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan jumlah ukuran segitiga: ");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++){
            printRow(size, i);
        }
    }
    private static void printRow(int size, int rowNumber){
        int space = size - rowNumber;
        for (int i=1; i<= space;i++){
            System.out.print(" ");
        }
        for (int i=1; i<=(rowNumber*2)-1;i++){
            System.out.print('*');
        }
        System.out.println();
    }
}
