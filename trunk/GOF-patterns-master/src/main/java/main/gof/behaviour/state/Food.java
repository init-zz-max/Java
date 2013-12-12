package main.gof.behaviour.state;

/**
 *
 */
public class Food implements State {
    public void pull(VendingMachineState wrapper) {
        wrapper.setState(new Change());
        System.out.println("Get food");
    }
}