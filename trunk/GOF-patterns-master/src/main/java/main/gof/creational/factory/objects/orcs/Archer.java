package main.gof.creational.factory.objects.orcs;

import main.gof.creational.factory.objects.Unit;

public class Archer implements Unit {

    public String unitDesignation() {
        return "Orc archer";
    }

    public int move() {
        return 17;
    }

    public int attack() {
        return 4;
    }
}
