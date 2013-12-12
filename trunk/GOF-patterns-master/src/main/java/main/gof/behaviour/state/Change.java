package main.gof.behaviour.state;

/**
 *
 */
public class Change implements State {
    public void pull(VendingMachineState wrapper) {
        wrapper.setState(new Off());
        System.out.println("Get change");
    }
}
