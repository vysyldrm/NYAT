import java.util.Scanner;

public class IslemPlatformu {
    private IVeriTabani veritabani;
    public IslemPlatformu(){
        veritabani = new PostgreSQLVeriTabani();
    }

    private final IEyleyiciModul eyleyiciModul = new EyleyiciModul();
    private final ISicaklikAlgilayici sicaklikAlgilayici = new SicaklikAlgilayici();
    private final IIslemci islemci = new Islemci(this.eyleyiciModul,this.sicaklikAlgilayici);
    private final IAgArayuzu agArayuzu = new AgArayuzu(this.islemci);

    String kullaniciAdi,sifre;

    public void basla(){

        Scanner input=new Scanner(System.in);

        System.out.println("Kullanici Adinizi Giriniz : ");
        String kullaniciAdi = input.nextLine();

        System.out.println("Sifrenizi Giriniz : ");
        String sifre = input.nextLine();

        if(veritabani.kullaniciDogrula(kullaniciAdi, sifre)){
            agArayuzu.menu();
        }
        else{
            System.out.println("Kullanici adi veya Sifre Yanlis...");
        }
    }
}
