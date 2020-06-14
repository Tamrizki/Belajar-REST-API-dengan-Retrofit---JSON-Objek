package tam.pa.belajarapi.model;

import java.util.List;

public class Komunitas {
//    TODO 3 Buat model data utama
    List<DaftarKomunitas>komunitas;

    public Komunitas(List<DaftarKomunitas> komunitas) {
        this.komunitas = komunitas;
    }

    public List<DaftarKomunitas> getKomunitas() {
        return komunitas;
    }

    public void setKomunitas(List<DaftarKomunitas> komunitas) {
        this.komunitas = komunitas;
    }
}
