package main.gof.behaviour.strategy;

public class Taxi implements Transport {
    public void move() {
        System.out.println("Travel by taxi");
    }
}
