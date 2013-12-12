package main.gof.creational.abstractFactory;

import main.gof.creational.abstractFactory.objects.elfs.ElfArcher;
import main.gof.creational.abstractFactory.objects.elfs.ElfFighter;
import main.gof.creational.abstractFactory.objects.elfs.ElfWarrior;
import main.gof.creational.factory.objects.Unit;

/**
 * Factory for create units
 */
public class FactoryElfs implements GamesElementsFactory {

    /**
     * Create elf fighter
     *
     * @return unit fighter
     */
    @Override
    public Unit makeFighter() {
        return new ElfFighter();
    }

    /**
     * Create elf warrior
     *
     * @return unit warrior
     */
    @Override
    public Unit makeWarrior() {
        return new ElfWarrior();
    }

    /**
     * Create elf archer
     *
     * @return unit archer
     */
    @Override
    public Unit makeArcher() {
        return new ElfArcher();
    }
}


