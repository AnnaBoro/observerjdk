package lesson6_9.adapter.observerjdk;


import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer{

    Observable observable;
    Pressa pressa;

    public Subscriber(Observable observable) {

        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof Publisher) {
            Publisher publisher = (Publisher) o;
            this.pressa = publisher.getPressa();
            display();
        }
    }

    public void display() {

        System.out.println("New edition of " + pressa.getName() + " " + pressa.getDate());
    }
}
