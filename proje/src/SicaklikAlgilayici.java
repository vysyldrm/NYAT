import java.util.Random;

public class SicaklikAlgilayici implements ISicaklikAlgilayici {
    public int sicaklikOku(){
        Random rand = new Random();
        int sicaklik = rand.nextInt(50);
        return sicaklik;
    }
}
