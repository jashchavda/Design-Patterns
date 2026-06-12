package org.example;

public interface IChannel {

    void subscribe(ISubscriber suscriber);
    void unsubscribe(ISubscriber suscriber);
    void notifySubscribers();
}
