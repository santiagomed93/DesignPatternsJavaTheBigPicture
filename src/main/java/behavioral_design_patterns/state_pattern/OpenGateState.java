package behavioral_design_patterns.state_pattern;

public class OpenGateState implements GateState{

    private Gate gate;
    public OpenGateState(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void enter() {
        System.out.println("Let user in");
        this.gate.changeState(new ClosedGateState(this.gate));
    }

    @Override
    public void payOk() {
        System.out.println("You already paid");
        this.gate.changeState(new OpenGateState(this.gate));
    }

    @Override
    public void payFailed() {
        System.out.println("the payment failed but you already paid");
        this.gate.changeState(new OpenGateState(this.gate));
    }
}
