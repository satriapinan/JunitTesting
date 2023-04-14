class PemilikPabrik extends Manusia {
	// Atribut
	private double kekayaan;	// Atribut kekayaan pemilik pabrik

	// Kosntruktor
	PemilikPabrik() {
		kekayaan = 0.0;
	}
	// Konstruktor dengan parameter
	PemilikPabrik(String noKTP, String nama, String alamat, double kekayaan) {
		setNoKTP(noKTP);
		setNama(nama);
		setAlamat(alamat);
		this.kekayaan = kekayaan;
	}

	// Setter
	public void setKekayaan(double kekayaan) {
		this.kekayaan = kekayaan;
	}
	// Getter
	public double getKekayaan() {
		return kekayaan;
	}
}