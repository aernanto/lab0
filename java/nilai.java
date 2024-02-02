import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Nilai Asli: ");
        int nilaiAsli = Integer.parseInt(scanner.nextLine());

        System.out.print("Masukkan Durasi: ");
        int durasi = Integer.parseInt(scanner.nextLine());

        double nilaiAkhir;

        if (durasi < 60) {
            nilaiAkhir = 1.2 * nilaiAsli;
        } else if (60 <= durasi && durasi <= 70) {
            nilaiAkhir = nilaiAsli;
        } else if (70 < durasi && durasi < 90) {
            nilaiAkhir = 0.75 * nilaiAsli;
        } else if (90 <= durasi && durasi <= 100) {
            nilaiAkhir = 0.5 * nilaiAsli;
        } else {
            nilaiAkhir = 0.2 * nilaiAsli;
        }

        System.out.println(nama + " mendapatkan nilai akhir " + nilaiAkhir);
    }
}
