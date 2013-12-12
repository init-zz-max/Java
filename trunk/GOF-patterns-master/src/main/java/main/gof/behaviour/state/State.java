package main.gof.behaviour.state;


interface State {
    void pull(VendingMachineState wrapper);
}
