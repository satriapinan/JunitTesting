class Obat extends BahanKonsumsiOral{
	// Atribut
	private String nama;			// Atribut nama Obat
	private int dosisPerHari;		// Atribut dosis per hari Obat
	private String bentuk;			// Atribut bentuk Obat
	private String penyakit;		// Atribut Obat untuk penyakit apa
	private String noIjinPabrik;	// Atribut nomor ijin pabrik Obat

	// Konstruktor
	Obat() {
		nama = "";
		dosisPerHari = 0;
		bentuk = "";
		penyakit = "";
		noIjinPabrik = "";
	}
	// Konstruktor dengan parameter
	Obat(String kode, String nama, String jenis, int dosisPerHari,
		 String bentuk, String penyakit, String noIjinPabrik) {
		setKode(kode);
		this.nama = nama;
		setJenis(jenis);
		this.dosisPerHari = dosisPerHari;
		this.bentuk = bentuk;
		this.penyakit = penyakit;
		this.noIjinPabrik = noIjinPabrik;
	}

	// Setter
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setDosisPerHari(int dosisPerHari) {
		this.dosisPerHari = dosisPerHari;
	}
	public void setBentuk(String bentuk) {
		this.bentuk = bentuk;
	}
	public void setPenyakit(String penyakit) {
		this.penyakit = penyakit;
	}
	public void setNoIjinPabrik(String noIjinPabrik) {
		this.noIjinPabrik = noIjinPabrik;
	}

	// Getter
	public String getNama() {
		return nama;
	}
	public int getDosisPerHari() {
		return dosisPerHari;
	}
	public String getBentuk() {
		return bentuk;
	}
	public String getPenyakit() {
		return penyakit;
	}
	public String getNoIjinPabrik() {
		return noIjinPabrik;
	}
}