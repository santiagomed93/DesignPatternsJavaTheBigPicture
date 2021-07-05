package behavioral_design_patterns.state_pattern;

public class Main {

    public static void main(String[] args){
        //The gate is close to initil state
        Gate gate = new Gate();

        //Happy path
        gate.payOk();
        gate.enter();

        System.out.println("______________________");

        //Another flow
        gate.payFailed();
        gate.enter();
        gate.payFailed();

        System.out.println("______________________");

        //Another flow
        gate.payFailed();
        gate.payOk();
        gate.payFailed();
        gate.payOk();
        gate.enter();

    }
}
