class Manusia {
	// Atribut
	private String noKTP;	// Atribut nomor KTP
	private String nama; 	// Atribut nama
	private String alamat;	// Atribut alamat

	// Kosntruktor
	Manusia() {
		noKTP = "";
		nama = "";
		alamat = "";
	}
	// Konstruktor dengan parameter
	Manusia(String noKTP, String nama, String alamat) {
		this.noKTP = noKTP;
		this.nama = nama;
		this.alamat = alamat;
	}

	// Setter
	public void setNoKTP(String noKTP) {
		this.noKTP = noKTP;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	// Getter
	public String getNoKTP() {
		return noKTP;
	}
	public String getNama() {
		return nama;
	}
	public String getAlamat() {
		return alamat;
	}
}