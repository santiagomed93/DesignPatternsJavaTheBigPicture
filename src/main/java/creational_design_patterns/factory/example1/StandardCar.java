package creational_design_patterns.factory.example1;

public class StandardCar implements Vehicle{
    @Override
    public void println() {
        System.out.println("It is a Standard Car");
    }
}
