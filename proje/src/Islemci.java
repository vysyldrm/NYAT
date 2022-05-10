public class Islemci implements IIslemci {
    public IEyleyiciModul eyleyiciModul;
    public ISicaklikAlgilayici sicaklikAlgilayici;
    Subscriber1 s1 = new Subscriber1();
    Subscriber2 s2 = new Subscriber2();
    Publisher publisher = new Publisher();

//    publisher.attach(s1);  ATTACH METODU CAGIRILMIYOR BU YUZDEN SUB. EKLENEMEDİ.
//    publisher.attach(s2);

    public Islemci(IEyleyiciModul eyleyiciModul, ISicaklikAlgilayici sicaklikAlgilayici) {
        this.eyleyiciModul = eyleyiciModul;
        this.sicaklikAlgilayici = sicaklikAlgilayici;
    }

    private String sogutucuDurum = "kapali";
    private int mevcutSicaklik = 0;

    public void islemYap(String islem) {
        if (islem == "ac") {
            this.sogutucuDurum = eyleyiciModul.sogutucuAc();
            System.out.println("Sogutucu Aciliyor...");
            publisher.notify("Sogutucunuzun yeni durumu :  " + sogutucuDurum);
        } else if (islem == "kapat") {
            this.sogutucuDurum = eyleyiciModul.sogucutuKapat();
            System.out.println("Sogutucu Kapatiliyor...");
            publisher.notify("Sogutucunuzun yeni durumu :  " + sogutucuDurum);
        } else if (islem == "sicaklikOku") {
            mevcutSicaklik = this.sicaklikAlgilayici.sicaklikOku();
            System.out.println("Sicaklik : " + mevcutSicaklik + " derece...");
            publisher.notify("Sicaklik degeri okundu :  " + mevcutSicaklik);
        }
        else{
            System.out.println("Komut algılanamadı...");
        }

    }
}
