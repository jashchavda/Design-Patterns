package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Channel channel=new Channel("CoderArmy");
        Subscriber sub1=new Subscriber("Varun",channel);

        Subscriber sub2=new Subscriber("Tarun",channel);

        channel.subscribe(sub1);
        channel.subscribe(sub2);

        channel.uploadVideo("Observer Pattern Tutorial");
        channel.unsubscribe(sub1);
        channel.uploadVideo("Decorator Pattern Tutorial");




    }
}