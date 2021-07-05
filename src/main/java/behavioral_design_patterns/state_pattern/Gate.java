package behavioral_design_patterns.state_pattern;

public class Gate {

    private GateState gateState;

    public Gate() {
        this.gateState = new ClosedGateState(this);
    }

    public void enter() {
        this.gateState.enter();
    }

    public void payOk() {
        this.gateState.payOk();
    }

    public void payFailed() {
        this.gateState.payFailed();
    }

    public void changeState (GateState newGateState) {
        this.gateState = newGateState;
    }
}
