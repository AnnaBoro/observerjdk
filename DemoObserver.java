package lesson6_9.adapter.observerjdk;

import java.util.Date;

public class DemoObserver {

    public static void main(String[] args) {

        Publisher publisher = new Publisher();
        Subscriber subscriber1 = new Subscriber(publisher);
        Subscriber subscriber2 = new Subscriber(publisher);

        Pressa pressa1 = new Magazine();
        pressa1.setName("Home");
        pressa1.setDate(new Date());

        Pressa pressa2 = new Newspaper();
        pressa2.setName("Crocodile");
        pressa2.setDate(new Date());

        publisher.setNewEditionPressa(pressa1);
        publisher.setNewEditionPressa(pressa2);

        System.out.println(publisher.countObservers());
        publisher.deleteObserver(subscriber2);
        System.out.println(publisher.countObservers());
    }
}
