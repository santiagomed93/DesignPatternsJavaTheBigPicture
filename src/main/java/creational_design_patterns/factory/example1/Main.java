package creational_design_patterns.factory.example1;

public class Main {
    public static void main(String[] args){
        String typeOfFactory = "motorcycle";
        VehicleFactory factory = null;
        if(typeOfFactory.equals("car")){
            factory = new CarFactory();
        }
        if(typeOfFactory.equals("motorcycle")){
            factory = new MotorcycleFactory();
        }
        Vehicle v1 = factory.create("standar");
        v1.println();
    }
}
