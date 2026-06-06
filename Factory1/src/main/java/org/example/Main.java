package org.example;

import classes.OS;
import classes.OSFactory;
import classes.windows;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       OS obj = new windows(); // here client know that which class he want to use, means we are exposing the interface
       obj.spec();

    //factory no object banav
    OSFactory os = new OSFactory();
    OS os1 = os.getInstance("Windows");
    os1.spec();
    OS os2 = os.getInstance("Android");
    os2.spec();
    OS os3 = os.getInstance("IOS");
    os3.spec();

    }
}