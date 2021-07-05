package behavioral_design_patterns.strategy_pattern;

public class Main {

    public static void main(String[] args){

        Context context = new Context();
        int a = 2;
        int b = 3;
        String action = "addition";

        if(action.equals("addition")) {
            context.setStrategy(new ConcreteStrategyAdd());
        }
        if(action.equals("subtraction")) {
            context.setStrategy(new ConcreteStrategySubtract());
        }
        if(action.equals("multiplication")) {
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        int result = context.executeStrategy(a,b);
        System.out.println(result);

    }
}
