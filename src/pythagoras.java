import java.util.Scanner;

public class pythagoras {
	public static void main(String[] args) {
		System.out.println("Menghitung sisi miring segitiga siku - siku");
		Scanner nilaiB = new Scanner(System.in);
		System.out.println("masukan nilai tinggi :");
		int b = nilaiB.nextInt();
		
		Scanner nilaiC = new Scanner(System.in);
		System.out.println("masukan nilai alas :");
		int c = nilaiC.nextInt();

		double a = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));

		System.out.println("Panjang sisi miring a : " + a);

	}
}
