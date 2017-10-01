package observerPattern;

import java.util.ArrayList;

/**
 * Created by mayank on 1/10/17.
 */
public class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {

    }

    @Override
    public void unregister(Observer o) {

    }

    @Override
    public void notifyObserver() {

    }
}
