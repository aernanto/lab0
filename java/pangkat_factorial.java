import java.util.Scanner;

public class pangkat_factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan bilangan utama (n): ");
        int n = Integer.parseInt(scanner.nextLine());

        System.out.print("masukkan pemangkatan (m): ");
        int m = Integer.parseInt(scanner.nextLine());

        // Factorial
        int hasilFact = 1;
        int tempN = n;
        while (tempN >= 1) {
            hasilFact = hasilFact * tempN;
            tempN = tempN - 1;
        }

        // Pangkat
        int hasilPangkat = 1;
        for (int i = 0; i < m; i++) {
            hasilPangkat = hasilPangkat * n;
        }

        System.out.println("n factorial = " + hasilFact);
        System.out.println("n pangkat m = " + hasilPangkat);
    }
}
