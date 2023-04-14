abstract class BahanKonsumsiOral {
	// Atribut
	private String kode;		// Atribut kode Bahan Konsumsi Oral
	private String deskripsi;	// Atribut deskripsi Bahan Konsumsi Oral
	private String jenis;		// Atribut jenis Bahan Konsumsi Oral
	private String kegunaan;	// Atribut kegunaan Bahan Konsumsi Oral

	// Konstruktor
	BahanKonsumsiOral() {
		kode = "";
		deskripsi = "";
		jenis = "";
		kegunaan = "";
	}
	// Konstruktor dengan parameter
	BahanKonsumsiOral(String kode, String deskripsi, String jenis, String kegunaan) {
		this.kode = kode;
		this.deskripsi = deskripsi;
		this.jenis = jenis;
		this.kegunaan = kegunaan;
	}

	// Setter
	public void setKode(String kode) {
		this.kode = kode;
	}
	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
	}
	public void setJenis(String jenis) {
		this.jenis = jenis;
	}
	public void setKegunaan(String kegunaan) {
		this.kegunaan = kegunaan;
	}

	// Getter
	public String getKode() {
		return kode;
	}
	public String getDeskripsi() {
		return deskripsi;
	}
	public String getJenis() {
		return jenis;
	}
	public String getKegunaan() {
		return kegunaan;
	}
}