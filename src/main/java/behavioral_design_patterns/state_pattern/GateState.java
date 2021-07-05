package behavioral_design_patterns.state_pattern;

public interface GateState {
    void enter();
    void payOk();
    void payFailed();
}
