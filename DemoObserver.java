package lesson6_9.adapter.observerjdk;

import java.util.Date;

public class DemoObserver {

    public static void main(String[] args) {

        Publisher publisher = new Publisher();

        Pressa pressa1 = new Magazine();
        pressa1.setName("Home");
        pressa1.setDate(new Date());
        Subscriber subscriber1 = new Subscriber(publisher, pressa1);
        publisher.setNewEditionPressa(pressa1);

        Pressa pressa2 = new Newspaper();
        pressa2.setName("Crocodile");
        pressa2.setDate(new Date());
        Subscriber subscriber2 = new Subscriber(publisher, pressa2);
        publisher.setNewEditionPressa(pressa2);
    }
}
