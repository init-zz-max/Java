package main.gof.creational.abstractFactory;

import main.gof.creational.factory.objects.Unit;

/**
 * Abstract factory interface
 */
public interface GamesElementsFactory {
    Unit makeFighter();

    Unit makeWarrior();

    Unit makeArcher();
}
