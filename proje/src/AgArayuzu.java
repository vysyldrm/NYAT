import java.util.Scanner;

public class AgArayuzu implements IAgArayuzu{
    IIslemci islemci;
    Komut islemKomutu;

    String komut = null;

    public AgArayuzu(IIslemci islemci){this.islemci = islemci;}

    @Override
    public void menu() {
        int secim = 0;
        Scanner input=new Scanner(System.in);

        do {
            System.out.println("***************************");
            System.out.println("Lutfen Islem Seciniz : ");
            System.out.println("1. Sogutucuyu Ac.");
            System.out.println("2. Sogutucuyu Kapat.");
            System.out.println("3.Sıcaklık Oku.");
            System.out.println("4. Cikis.");
            System.out.println("Seciminiz : ");
            System.out.println("***************************");

            secim = input.nextInt();

            switch(secim){
                case 1:
                    islemKomutu = new KomutSogutucuAc();
                    komut = islemKomutu.islemYap();
                    this.islemci.islemYap(komut);
                    break;
                case 2:
                    islemKomutu = new KomutSogutucuKapat();
                    komut = islemKomutu.islemYap();
                    this.islemci.islemYap(komut);
                    break;
                case 3:
                    islemKomutu = new KomutSicaklıkOku();
                    komut = islemKomutu.islemYap();
                    this.islemci.islemYap(komut);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Hatali Tercih...");
                    break;
            }
        }while(secim != 4);
    }
    }