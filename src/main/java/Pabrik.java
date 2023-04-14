class Pabrik {
	// Atribut
	private String noIjin;			// Atribut nomor ijin pabrik
	private String noKTPPemilik;	// Atribut nomor KTP pemilik
	private String namaPemilik;		// Atribut nama pemilik
	private String jenisProduksi;	// Atribut jenis produksi pabrik

	// Konstruktor
	Pabrik() {}
	// Konstruktor dengan parameter
	Pabrik(String noIjin, PemilikPabrik pemilik, String jenisProduksi) {
		this.noIjin = noIjin;
		this.noKTPPemilik = pemilik.getNoKTP();
		this.namaPemilik = pemilik.getNama();
		this.jenisProduksi = jenisProduksi;
	}

	// Setter
	public void setNoIjin(String noIjin) {
		this.noIjin = noIjin;
	}
	public void setNoKTPPemilik(PemilikPabrik pemilik) {
		this.noKTPPemilik = pemilik.getNoKTP();
	}
	public void setNamaPemilik(PemilikPabrik pemilik) {
		this.namaPemilik = pemilik.getNama();
	}
	public void setJenisProduksi(String jenisProduksi) {
		this.jenisProduksi = jenisProduksi;
	}

	// Getter
	public String getNoIjin() {
		return noIjin;
	}
	public String getNoKTPPemilik() {
		return noKTPPemilik;
	}
	public String getNamaPemilik() {
		return namaPemilik;
	}
	public String getJenisProduksi() {
		return jenisProduksi;
	}
}