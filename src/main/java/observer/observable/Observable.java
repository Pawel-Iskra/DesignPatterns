package observer.observable;

import observer.observers.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyRegisteredObservers();
}
