public class Subscriber1 implements IObserver {
    @Override
    public void update(String mesaj) {
        System.out.println("Akilli cihazinizdan mesaj var : " + mesaj);
    }
}