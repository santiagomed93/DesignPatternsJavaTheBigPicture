package creational_design_patterns.factory.example1;

public class CarFactory implements VehicleFactory{
    @Override
    public Vehicle create(String type) {
        Vehicle v = null;
        switch(type){
            case "car":
                v = new CompactCar();
                break;
            case "sedan":
                v = new SedanCar();
                break;
            default:
                v = new StandardCar();
                break;
        }
        return v;
    }
}
