public class Main {
    public static void main(String[] args) {
        Musteri musteri1 = new Musteri("Ahmet");

        Siparis siparis1 = new Siparis(101);
        Siparis siparis2 = new Siparis(102);

        musteri1.siparisEkle(siparis1);
        musteri1.siparisEkle(siparis2);

        System.out.println("Müşteri: " + musteri1.getAd());
        for (Siparis s : musteri1.getSiparisler()) {
            System.out.println("Sipariş No: " + s.getSiparisNo() + ", Müşteri: " + s.getMusteri().getAd());
        }
    }
}
