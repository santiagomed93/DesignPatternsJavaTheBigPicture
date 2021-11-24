package creational_design_patterns.factory.example1;

public class MotorcycleFactory implements VehicleFactory{
    @Override
    public Vehicle create(String type) {
        Vehicle v = null;
        switch(type){
            case "scooter":
                v = new Scooter();
                break;
            case "sportBike":
                v = new SportBike();
                break;
            default:
                v = new StandardBike();
                break;
        }
        return v;
    }
}
