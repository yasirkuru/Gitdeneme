import java.util.ArrayList;
import java.util.List;

public class Musteri {
    private String ad;
    private List<Siparis> siparisler;

    public Musteri(String ad) {
        this.ad = ad;
        this.siparisler = new ArrayList<>();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public List<Siparis> getSiparisler() {
        return siparisler;
    }

    public void siparisEkle(Siparis siparis) {
        siparisler.add(siparis);
        siparis.setMusteri(this);
    }
}
