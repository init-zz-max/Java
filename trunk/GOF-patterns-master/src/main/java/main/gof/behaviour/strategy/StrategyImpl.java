package main.gof.behaviour.strategy;

/**
 * Example move strategy
 */
public class StrategyImpl {
    private Transport strategy;

    public StrategyImpl(Transport start) {
        strategy = start;
    }

    /**
     * Transport provide to move
     */
    public void travel() {
        strategy.move();
    }

    /**
     * Method provide to change algorithm
     *
     * @param newTransport
     */
    public void changeTransport(Transport newTransport) {
        strategy = newTransport;
    }
}
