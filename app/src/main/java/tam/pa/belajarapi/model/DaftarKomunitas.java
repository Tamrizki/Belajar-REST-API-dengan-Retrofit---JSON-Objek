package tam.pa.belajarapi.model;

public class DaftarKomunitas {
//    TODO 4 Buat sub-model
    String id;
    String nama;
    String logo_url;
    String kategori;
    String deskripsi;

    public DaftarKomunitas(String id, String nama, String logo_url, String kategori, String deskripsi) {
        this.id = id;
        this.nama = nama;
        this.logo_url = logo_url;
        this.kategori = kategori;
        this.deskripsi = deskripsi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLogo_url() {
        return logo_url;
    }

    public void setLogo_url(String logo_url) {
        this.logo_url = logo_url;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
