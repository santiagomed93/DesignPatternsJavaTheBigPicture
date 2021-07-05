package behavioral_design_patterns.strategy_pattern;

public class ConcreteStrategySubtract implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
