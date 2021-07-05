package behavioral_design_patterns.state_pattern;

public class ClosedGateState implements GateState{

    private Gate gate;
    public ClosedGateState(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void enter() {
        System.out.println("You can not pass, you need to pay");
        this.gate.changeState(new ClosedGateState(this.gate));
    }

    @Override
    public void payOk() {
        System.out.println("You can pass");
        this.gate.changeState(new OpenGateState(this.gate));
    }

    @Override
    public void payFailed() {
        System.out.println("The payment failed, you can not pass");
        this.gate.changeState(new ClosedGateState(this.gate));
    }
}
