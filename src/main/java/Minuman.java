class Minuman extends BahanKonsumsiOral{
	// Atribut
	private String nama;			// Atribut nama Minuman
	private int kandunganGula;	// Atribut kandungan gula Minuman
	private String noIjinPabrik;	// Atribut nomor ijin pabrik Minuman

	// Konstruktor
	Minuman() {
		nama = "";
		kandunganGula = 0;
		noIjinPabrik = "";
	}
	// Konstruktor dengan parameter
	Minuman(String kode, String nama, int kandunganGula, String jenis, String noIjinPabrik) {
		setKode(kode);
		this.nama = nama;
		setJenis(jenis);
		this.kandunganGula = kandunganGula;
		this.noIjinPabrik = noIjinPabrik;
	}

	// Setter
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setKandunganGula(int kandunganGula) {
		this.kandunganGula = kandunganGula;
	}
	public void setNoIjinPabrik(String noIjinPabrik) {
		this.noIjinPabrik = noIjinPabrik;
	}

	// Getter
	public String getNama() {
		return nama;
	}
	public int getKandunganGula() {
		return kandunganGula;
	}
	public String getNoIjinPabrik() {
		return noIjinPabrik;
	}
}