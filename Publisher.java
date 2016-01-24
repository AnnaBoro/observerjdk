package lesson6_9.adapter.observerjdk;


import java.util.Observable;

public class Publisher extends Observable{

    private Pressa pressa;

    public Publisher() {
    }

    public void pressaUpdate() {
        setChanged();
        notifyObservers();
    }

    public void setNewEditionPressa(Pressa pressa) {
        this.pressa = pressa;
        pressaUpdate();
    }

    public Pressa getPressa() {
        return pressa;
    }
}
