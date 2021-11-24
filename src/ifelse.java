import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
		Scanner bangunDatar = new Scanner(System.in);
		System.out.println("pilih bangun datar :");
		System.out.println("1. persegi panjang");
		System.out.println("2. segitiga");
		int _bangunDatar = bangunDatar.nextInt();

		switch (_bangunDatar) {
		case 1: {
			Scanner luasKeliling = new Scanner(System.in);

			System.out.println("1. Luas");
			System.out.println("2. Keliling");
			int _luasKeliling = luasKeliling.nextInt();
			if (_luasKeliling == 1) {
				Scanner panjang = new Scanner(System.in);
				System.out.println("panjang :");
				int _panjang = panjang.nextInt();

				Scanner lebar = new Scanner(System.in);
				System.out.println("lebar :");
				int _lebar = lebar.nextInt();

				System.out.println("Luas = " + _lebar * _panjang);

			} else {
				Scanner panjang = new Scanner(System.in);
				System.out.println("panjang :");
				int _panjang = panjang.nextInt();

				Scanner lebar = new Scanner(System.in);
				System.out.println("lebar :");
				int _lebar = lebar.nextInt();

				System.out.println("Luas = " + _lebar * 2 + 2 * _panjang);
			}
			break;
		}
		case 2: {
			Scanner luasKeliling = new Scanner(System.in);

			System.out.println("1. Luas");
			System.out.println("2. Keliling");
			int _luasKeliling = luasKeliling.nextInt();
			if (_luasKeliling == 1) {
				Scanner t = new Scanner(System.in);
				System.out.println("tinggi :");
				int _t = t.nextInt();

				Scanner a = new Scanner(System.in);
				System.out.println("alas :");
				int _a = a.nextInt();

				double hasil = _a * _t / 2;
				System.out.println("Luas = " + hasil);

			} else {
				Scanner t = new Scanner(System.in);
				System.out.println("tinggi :");
				int _t = t.nextInt();

				Scanner a = new Scanner(System.in);
				System.out.println("alas :");
				int _a = a.nextInt();

				Scanner sisiMiring = new Scanner(System.in);
				System.out.println("sisi miring :");
				int _sisiMiring = sisiMiring.nextInt();

				System.out.println("Luas = " + (_t + _a + _sisiMiring));
			}
			break;
		}
		}

	}
}
