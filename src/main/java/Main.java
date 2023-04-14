import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// Untuk input
		Scanner sc = new Scanner(System.in);
		int n = 0; // jumlah yang ingin diinput

		// Tampilan awal
		System.out.println("===== Selamat Datang di Program Pendataan Makanan, Minuman, dan Obat =====\n");

		// MAKANAN

		// ArrayList Makanan untuk menyimpan objek makanan
		ArrayList<Makanan> makanan = new ArrayList<>();

		// Input data makanan secara dinamis
		System.out.print("Masukkan jumlah makanan yang ingin diinput: ");
		if (sc.hasNextInt()) {
			n = sc.nextInt();
			if (n < 0) {
				System.exit(0);
			}
		} else {
			System.exit(0);
		}

		for(int i = 0; i < n; i++) {
			Makanan newMakanan = new Makanan();
			System.out.println("Input data makanan ke-" + (i+1) + ": ");
			try {
				System.out.print("Kode: ");
				newMakanan.setKode(sc.next());
				System.out.print("Nama: ");
				newMakanan.setNama(sc.next());
				System.out.print("Kandungan Gizi: ");
				newMakanan.setKandunganGizi(sc.next());

				String jenis;
				System.out.print("Jenis (MakananPokok, Snack, atau MakananPendamping): ");
				jenis = sc.next();
				if (!jenis.equals("MakananPokok") && !jenis.equals("Snack") && !jenis.equals("MakananPendamping")) {
					System.exit(0);
				}
				newMakanan.setJenis(jenis);

				System.out.print("Nomor Ijin Pabrik: ");
				newMakanan.setNoIjinPabrik(sc.next());
			} catch(Exception e) {}
			makanan.add(newMakanan);
		}

		// MINUMAN

		// ArrayList Minuman untuk menyimpan objek minuman
		ArrayList<Minuman> minuman = new ArrayList<>();

		// Input data minuman secara dinamis
		System.out.print("\nMasukkan jumlah minuman yang ingin diinput: ");
		if (sc.hasNextInt()) {
			n = sc.nextInt();
			if (n < 0) {
				System.exit(0);
			}
		} else {
			System.exit(0);
		}

		for(int i = 0; i < n; i++) {
			Minuman newMinuman = new Minuman();
			System.out.println("Input data minuman ke-" + (i+1) + ": ");
			try {
				System.out.print("Kode: ");
				newMinuman.setKode(sc.next());
				System.out.print("Nama: ");
				newMinuman.setNama(sc.next());
				System.out.print("Kandungan Gula: ");
				newMinuman.setKandunganGula(sc.nextInt());

				String jenis;
				System.out.print("Jenis (AirBersih, Suplemen, atau Buah): ");
				jenis = sc.next();
				if (!jenis.equals("AirBersih") && !jenis.equals("Suplemen") && !jenis.equals("Buah")) {
					System.exit(0);
				}
				newMinuman.setJenis(jenis);

				System.out.print("Nomor Ijin Pabrik: ");
				newMinuman.setNoIjinPabrik(sc.next());
			} catch(Exception e) {}

			// tambahkan objek minuman ke ArrayList minuman
			minuman.add(newMinuman);
		}

		// OBAT

		// ArrayList Obat untuk menyimpan objek obat
		ArrayList<Obat> obat = new ArrayList<>();

		// Input data obat secara dinamis
		System.out.print("\nMasukkan jumlah obat yang ingin diinput: ");
		if (sc.hasNextInt()) {
			n = sc.nextInt();
			if (n < 0) {
				System.exit(0);
			}
		} else {
			System.exit(0);
		}


		for(int i = 0; i < n; i++) {
			Obat newObat = new Obat();
			System.out.println("Input data obat ke-" + (i+1) + ": ");
			try {
				System.out.print("Kode: ");
				newObat.setKode(sc.next());
				System.out.print("Nama: ");
				newObat.setNama(sc.next());
				System.out.print("Jenis: ");
				newObat.setJenis(sc.next());

				int dose;
				try {
					System.out.print("Dosis Per Hari (1-3): ");
					dose = sc.nextInt();
					if (dose < 1 || dose > 3) {
						System.exit(0);
					}
					newObat.setDosisPerHari(dose);
				} catch (InputMismatchException e) {
					System.exit(0);
				}

				System.out.print("Bentuk: ");
				newObat.setBentuk(sc.next());
				System.out.print("Penyakit: ");
				newObat.setPenyakit(sc.next());
				System.out.print("Nomor Ijin Pabrik: ");
				newObat.setNoIjinPabrik(sc.next());
			} catch(Exception e) {}

			// tambahkan objek minuman ke ArrayList minuman
			obat.add(newObat);
		}

		// Print data makanan
		System.out.println("\n===== Data Makanan =====");
		for(int i = 0; i < makanan.size(); i++) {
			System.out.println("Makanan " + (i+1) + ":");
			System.out.println("Kode: " + makanan.get(i).getKode());
			System.out.println("Nama: " + makanan.get(i).getNama());
			System.out.println("Kandungan Gizi: " + makanan.get(i).getKandunganGizi());
			System.out.println("Jenis: " + makanan.get(i).getJenis());
			System.out.println("Nomor Ijin Pabrik: " + makanan.get(i).getNoIjinPabrik());
		}
		// Print data minuman
		System.out.println("\n===== Data Minuman =====");
		for(int i = 0; i < minuman.size(); i++) {
			System.out.println("Minuman " + (i+1) + ":");
			System.out.println("Kode: " + minuman.get(i).getKode());
			System.out.println("Nama: " + minuman.get(i).getNama());
			System.out.println("Kandungan Gula: " + minuman.get(i).getKandunganGula());
			System.out.println("Jenis: " + minuman.get(i).getJenis());
			System.out.println("Nomor Ijin Pabrik: " + minuman.get(i).getNoIjinPabrik());
		}
		// Print data obat
		System.out.println("\n===== Data Obat =====");
		for(int i = 0; i < obat.size(); i++) {
			System.out.println("Obat " + (i+1) + ":");
			System.out.println("Kode: " + obat.get(i).getKode());
			System.out.println("Nama: " + obat.get(i).getNama());
			System.out.println("Jenis: " + obat.get(i).getJenis());
			System.out.println("Dosis Per Hari: " + obat.get(i).getDosisPerHari());
			System.out.println("Bentuk: " + obat.get(i).getBentuk());
			System.out.println("Penyakit: " + obat.get(i).getPenyakit());
			System.out.println("Nomor Ijin Pabrik: " + obat.get(i).getNoIjinPabrik());
		}
	}
}

