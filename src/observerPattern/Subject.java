package observerPattern;


/**
 * Created by mayank on 1/10/17.
 */
public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}
