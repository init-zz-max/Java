package main.gof.behaviour.state;


public class Off implements State {
    public void pull(VendingMachineState wrapper) {
        System.out.println("Machine will be shutting down");
    }
}
