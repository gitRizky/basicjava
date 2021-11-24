import java.util.Scanner;

public class hari1 {

	public static void main(String[] args) {
		double phi = 3.14;

		Scanner inputJari2 = new Scanner(System.in);
		System.out.println("Menghitung Luas Lingkaran");
		System.out.println("Masukan nilai jari - jari lingkaran :");

		double nilaiJari2 = inputJari2.nextDouble();
		System.out.println("luas lingkaran = " + phi * Math.pow(nilaiJari2, 2));

	}
}
