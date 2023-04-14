class Makanan extends BahanKonsumsiOral{
	// Atribut
	private String nama;			// Atribut nama Makanan
	private String kandunganGizi;	// Atribut kandungan gizi Makanan
	private String noIjinPabrik;	// Atribut nomor ijin pabrik Makanan

	// Konstruktor
	Makanan() {
		nama = "";
		kandunganGizi = "";
		noIjinPabrik = "";
	}
	// Konstruktor dengan parameter
	Makanan(String kode, String nama, String kandunganGizi, String jenis, String noIjinPabrik) {
		setKode(kode);
		this.nama = nama;
		this.kandunganGizi = kandunganGizi;
		setJenis(jenis);
		this.noIjinPabrik = noIjinPabrik;
	}

	// Setter
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setKandunganGizi(String kandunganGizi) {
		this.kandunganGizi = kandunganGizi;
	}
	public void setNoIjinPabrik(String noIjinPabrik) {
		this.noIjinPabrik = noIjinPabrik;
	}

	// Getter
	public String getNama() {
		return nama;
	}
	public String getKandunganGizi() {
		return kandunganGizi;
	}
	public String getNoIjinPabrik() {
		return noIjinPabrik;
	}
}