package org.example;

import java.util.ArrayList;
import java.util.List;

public class Channel implements IChannel {
    private List<ISubscriber> subscribers;
    private String name;
    private String latestVideo;

    public Channel(String name) {
         this.name = name;
         subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(ISubscriber subscriber) {
     if(!subscribers.contains(subscriber)) {
         subscribers.add(subscriber);
     }
    }

    @Override
    public void unsubscribe(ISubscriber subscriber) {
         subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
          for(ISubscriber subscriber : subscribers) {
              subscriber.update();
          }
    }


    public void uploadVideo(String title){

        latestVideo=title;

        System.out.println(
                "\n["+name+" uploaded \""+title+"\"]"
        );

        notifySubscribers();

    }

    public String getVideoData(){

        return "\nCheckout our new Video : "+latestVideo+"\n";

    }






}
